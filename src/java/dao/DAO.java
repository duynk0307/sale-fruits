/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.CartItem;
import entity.CartSession;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Khanh Duy;
 */
public class DAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Account> getListAccount() {
        try {
            String query = "select * from UserLogin";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            List<Account> list = new ArrayList<>();
            while (rs.next()) {
                Account account = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                list.add(account);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Account getLoginAccount(String username, String password) {
        try {
            String query = "select * from UserLogin\n"
                    + "where username=? and password=?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            rs = ps.executeQuery();

            while (rs.next()) {
                Account account = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                return account;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Account checkSignUp(String username) {
        try {
            String query = "select * from UserLogin\n"
                    + "where username=?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                Account account = new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                return account;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void signUp(String username, String password, String email, String phone) {
        try {
            String query = "insert into UserLogin\n"
                    + "values(?,?,?,?,0)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Product> getListProduct() {
        try {
            String query = "select * from Product";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDouble(7), rs.getDouble(8));
                list.add(product);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public List<Category> getListCategory() {
        try {
            String query = "select * from Category";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            List<Category> list = new ArrayList<>();
            while (rs.next()) {
                Category cate = new Category(rs.getString(1), rs.getString(2));
                list.add(cate);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public List<CartItem> getListCartItem(int userID) {
        List<CartItem> list = new ArrayList<>();
        try {
            String query = "select ci.cartID,ci.sessionID, ci.productID, ci.quantity, ci.\"state\" from CartItem ci, \n"
                    + "(select * from CartSession where userID = ?) cs\n"
                    + "where ci.sessionID = cs.sessionID";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();

            while (rs.next()) {
                CartItem cItem = new CartItem(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
                list.add(cItem);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    public CartItem getProductCartItem(String productID) {

        CartItem item = new CartItem();
        try {
            String query = "select * from CartItem where productID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, productID);
            rs = ps.executeQuery();

            while (rs.next()) {
                item = new CartItem(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5));
            }
            return item;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return item;
    }

    public void insertCartItem(int sessionID, String productID) {
        try {
            String query = "insert into CartItem\n"
                    + "values(?,?,1,1)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, productID);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateCartItem(int cartID, int quantity) {
        try {
            String query = "UPDATE CartItem SET quantity = ? WHERE cartID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setInt(2, cartID);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public void changeState(int cartID) {
        try {
            String query = "UPDATE CartItem SET quantity = 1, state = 1 WHERE cartID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, cartID);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public CartSession getCartSession(int userID) {

        CartSession cSession = new CartSession();
        try {
            String query = "select * from CartSession";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                cSession = new CartSession(rs.getInt(1), rs.getInt(2), rs.getDouble(3));
            }
            return cSession;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cSession;
    }
}
