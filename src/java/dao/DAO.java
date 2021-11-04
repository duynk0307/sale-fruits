/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import entity.Account;
import entity.Banner;
import entity.CartItem;
import entity.CartSession;
import entity.Category;
import entity.Product;
import entity.Saleoff;
import entity.Sources;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
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
        try {
            String query = "select ci.cartID, ci.sessionID, ci.productID, ci.quantity, ci.\"state\", ci.total from CartItem ci, \n"
                    + "(select * from CartSession where userID = ?) c\n"
                    + "where ci.sessionID = c.sessionID";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            List<CartItem> list = new ArrayList<>();
            while (rs.next()) {
                CartItem cItem = new CartItem(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), getProductByID(rs.getString(3)));
                list.add(cItem);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return new ArrayList<>();
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
                item = new CartItem(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), getProductByID(rs.getString(3)));
            }
            return item;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void insertCartItem(int sessionID, String productID, double salePrice) {
        try {
            String query = "insert into CartItem\n"
                    + "values(?,?,1,1, ?)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, sessionID);
            ps.setString(2, productID);
            ps.setDouble(3, salePrice);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateCartItem(int cartID, int quantity, double total) {
        try {
            String query = "UPDATE CartItem SET quantity = ?, total = ? WHERE cartID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, quantity);
            ps.setDouble(2, total * quantity);
            ps.setInt(3, cartID);
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
                cSession = new CartSession(rs.getInt(1), rs.getInt(2), rs.getDouble(3), getListCartItem(userID));
            }
            return cSession;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cSession;
    }

    public List<Product> getLastProduct() {
        try {
            String query = "SELECT TOP 6 * FROM Product p\n"
                    + "ORDER BY p.productID DESC";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getDouble(7),
                        rs.getDouble(8));
                list.add(product);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public List<Product> getBestsellingProduct() {
        try {
            String query = "select * from(SELECT TOP 6 productID FROM OrderDetails o\n"
                    + "ORDER BY o.orderQuantity DESC) r, Product p\n"
                    + "Where p.productID = r.productID";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product(
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7),
                        rs.getDouble(8), rs.getDouble(9));
                list.add(product);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public List<Sources> getLogoSourses() {
        try {
            String query = "select * from Sources";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            List<Sources> list = new ArrayList<>();
            while (rs.next()) {
                Sources so = new Sources(rs.getString(1), rs.getString(2), rs.getString(3));
                list.add(so);
            }
            return list;

        } catch (Exception e) {
        }
        return null;
    }

    public List<Category> getFeaturedProduct() {
        try {
            String query = "select r.cateID, c.cateName from Category c,(SELECT DISTINCT Top 4 cateID FROM Product p\n"
                    + "where p.inventory > 0\n"
                    + "ORDER BY p.cateID DESC) r\n"
                    + "where c.cateID = r.cateID";
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

    public List<Banner> getListBanner() {
        try {
            String query = "select * from Banner";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            List<Banner> list = new ArrayList<>();
            while (rs.next()) {
                Banner banner = new Banner(rs.getString(1),
                        rs.getString(2));
                list.add(banner);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public Product getProductByID(String id) {
        try {
            String query = "select * from Product p\n"
                    + "where p.productID = ?";

            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getDouble(7),
                        rs.getDouble(8));
            }

        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getRelatedProduct(List<Product> rltProduct, Product p) {
        List<Product> rltPro = new ArrayList<>();
        int count = 0;
        for (Product rp : rltProduct) {
            if (rp.getProductID().equals(p.getProductID())) {
                count++;
            }
        }
        if (count == 0) {
            rltProduct.add(p);
            rltPro.addAll(rltProduct);
        } else {
            for (Product rp : rltProduct) {
                if (!rp.getProductID().equals(p.getProductID())) {
                    rltPro.add(rp);
                }
            }
            rltPro.add(p);
        }
        rltProduct.clear();
        rltProduct.addAll(rltPro);
        Collections.reverse(rltPro);

        return rltPro;
    }

    public List<Saleoff> getListSaleOff() {
        try {
            String query = "select * from Saleoff s, Product p, Category c\n"
                    + "where s.productID = p.productID\n"
                    + "	and p.cateID = c.cateID";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            List<Saleoff> list = new ArrayList<>();
            while (rs.next()) {
                Saleoff saleoff = new Saleoff(
                        rs.getString(1), rs.getDouble(2),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getDouble(9),
                        rs.getString(12));
                list.add(saleoff);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public int getTotalProduct() {
        String query = "select count(*) from Product";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product p\n"
                + "ORDER BY p.productID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, (index - 1) * 6);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getDouble(7),
                        rs.getDouble(8));
                list.add(product);
            }
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getReviewProduct() {
        try {
            String query = "SELECT TOP 6 * FROM Product p\n"
                    + "ORDER BY p.salePrice DESC";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            List<Product> list = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product(rs.getString(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getDouble(7),
                        rs.getDouble(8));
                list.add(product);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
