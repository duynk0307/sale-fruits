/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import context.DBContext;
import controlServlet.OrderDetailsControl;
import entity.Account;
import entity.Banner;
import entity.CartItem;
import entity.CartSession;
import entity.Category;
import entity.OrderDetails;
import entity.OrderItem;
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
    Connection con1 = null;
    PreparedStatement ps1 = null;
    ResultSet rs1 = null;

    public List<Account> getListAccount() {
        try {
            String query = "select * from UserLogin isDelete = 0";
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
                    + "where username=? and password=? and isDelete = 0";
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

    public Account getAccountById(int userID) {
        try {
            String query = "select * from UserLogin\n"
                    + "where userID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
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
                    + "where username=? and isDelete = 0";
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

    public void signUp(String username, String password, String fullname, String phone, String address, String email) {
        try {
            String query = "insert into UserLogin\n"
                    + "values(?,?,?,?,?,?,0)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, fullname);
            ps.setString(4, phone);
            ps.setString(5, address);
            ps.setString(6, email);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateAccount(int userID, String fullName, String phone, String email, String address) {
        try {
            String query = "UPDATE UserLogin\n"
                    + "SET fullName = ?, phone = ?, address = ?, email = ? WHERE userID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, fullName);
            ps.setString(2, phone);
            ps.setString(3, address);
            ps.setString(4, email);
            ps.setInt(5, userID);
            ps.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<Product> getListProduct() {
        try {
            String query = "select * from Product where isDelete = 0";
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
        List<Product> listP = getListProduct();
        try {
            String query = "select ci.cartID, ci.sessionID, ci.productID, ci.quantity, ci.\"state\", ci.total from CartItem ci\n"
                    + "INNER JOIN (select * from CartSession where userID = ?) c \n"
                    + "ON c.sessionID = ci.sessionID and ci.\"state\" = 1;";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
            rs = ps.executeQuery();
            List<CartItem> list = new ArrayList<>();
            while (rs.next()) {
                for (int i = 0; i < listP.size(); i++) {
                    if (listP.get(i).getProductID().equals(rs.getString(3))) {
                        list.add(new CartItem(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), listP.get(i)));
                    }
                }
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return new ArrayList<>();
    }

    public CartItem getProductCartItem(int sessionID, String productID) {

        CartItem item = new CartItem();
        Product pro = getProductByID(productID);
        try {
            String query = "select * from CartItem where sessionID = ? and productID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, sessionID);
            ps.setString(2, productID);
            rs = ps.executeQuery();

            while (rs.next()) {
                item = new CartItem(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getDouble(6), pro);
            }
            if (item.getCartID() == 0) {
                return null;
            } else {
                return item;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public double getCartTotal(int sessionID) {
        try {
            String query = "select sum(total) total from CartItem where sessionID = ? and \"state\" = 1";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, sessionID);
            rs = ps.executeQuery();
            while (rs.next()) {
                double total = rs.getDouble(1);
                System.out.println("chay thanh cong" + total);
                return total;
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    public double setCartTotal(double total, int sessionID) {
        try {
            String query = "UPDATE CartSession SET total = ? WHERE sessionID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setDouble(1, total);
            ps.setInt(2, sessionID);
            ps.executeUpdate();
            System.out.println("update tong tien gio hang thanh cong");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    public void insertCartItem(int sessionID, String productID, double salePrice) {
        try {
            String query = "insert into CartItem values(?,?,1,1,?)";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, sessionID);
            ps.setString(2, productID);
            ps.setDouble(3, salePrice);
            ps.executeUpdate();
            System.out.println(sessionID);
            System.out.println(productID);
            System.out.println(salePrice);

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

    public void changeStateOn(int cartID) {
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

    public void changeStateOff(int cartID) {
        try {
            String query = "UPDATE CartItem SET state = 0 WHERE cartID = ?";
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
            String query = "select * from CartSession where userID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, userID);
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
            String query = "SELECT TOP 6 * FROM Product p where p.isDelete = 0\n"
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
                    + "Where p.productID = r.productID AND p.isDelete = 0";
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
                    + "where p.inventory > 0 and p.isDelete=0\n"
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
                    + "where s.productID = p.productID AND p.isDelete = 0\n"
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
                        rs.getString(13));
                list.add(saleoff);
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public int getTotalProduct() {
        String query = "select count(*) from Product p left join Saleoff s\n"
                + "on p.productID = s.productID\n"
                + "where s.saleOff is NULL\n"
                + "	and isDelete = 0";
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

    public int getTotalCate(String cid) {
        String cateID = "%" + cid + "%";
        String query = "select count(*) from Product c \n"
                + "where c.cateID Like ?\n"
                + " and c.isDelete = 0";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cateID);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProductByCate(int index, String cid) {
        String cateID = "";
        if (cid == null) {
            cateID = "%TC%";
        } else {
            cateID = "%" + cid + "%";
        }
        List<Product> list = new ArrayList<>();
        String query = "select * from Product p\n"
                + "where p.cateID Like ? and p.isDelete = 0\n"
                + "ORDER BY p.productID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cateID);
            ps.setInt(2, (index - 1) * 6);
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
            String query = "SELECT TOP 6 * FROM Product p WHERE p.isDelete = 0\n"
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

    public List<Product> getProductBySourceID(String cid) {
        String query = "select p.* from Product p, ImportDetails i\n"
                + "where i.sourceID = ? and p.isDelete=0\n"
                + "	and p.productID = i.productID";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cid);
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
        }
        return null;
    }

    public int getTotalSrc(String cid) {
        String query = "select Count(*) from Product p, ImportDetails i\n"
                + "where i.sourceID = ? and p.isDelete = 0\n"
                + "and p.productID = i.productID";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingProductBySrc(int index, String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select p.* from Product p, ImportDetails i\n"
                + "where i.sourceID Like ? and p.isDelete=0\n"
                + "	and p.productID = i.productID\n"
                + "ORDER BY p.productID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, cid);
            ps.setInt(2, (index - 1) * 6);
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

    public int getTotalUser() {
        try {
            String query = "SELECT count(*) from UserLogin where isDelete = 0";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    public List<Account> pagingUser(int index) {
        List<Account> list = new ArrayList<>();
        String query = "select * from UserLogin where isDelete = 0\n"
                + "ORDER BY userID\n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getInt(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7),
                        rs.getInt(8));
                list.add(acc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public void deleteProduct(String productID) {
        try {
            String query = "UPDATE Product\n"
                    + "SET isDelete = 1\n"
                    + "WHERE productID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, productID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void updateProduct(String productID, String productName, String image, String title, String description, String cateID, double salePrice) {
        try {
            String query = "UPDATE Product\n"
                    + "SET productName = ?, image = ?, title = ?, description = ?, cateID = ?, salePrice = ?\n"
                    + "WHERE productID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, productName);
            ps.setString(2, image);
            ps.setString(3, title);
            ps.setString(4, description);
            ps.setString(5, cateID);
            ps.setDouble(6, salePrice);
            ps.setString(7, productID);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public List<OrderItem> getListOrder() {

        List<OrderItem> list = new ArrayList<>();
        try {
            String query = "SELECT * from OrderItems";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new OrderItem(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)));
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    public int getTotalOrder() {
        try {
            String query = "SELECT count(*) from OrderItems";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return 0;
    }

    public List<Account> pagingOrder(int index) {
        List<Account> list = new ArrayList<>();
        String query = "select * from OrderItems\n"
                + "ORDER BY userID\n"
                + "OFFSET ? ROWS FETCH NEXT 10 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, (index - 1) * 10);
            rs = ps.executeQuery();
            while (rs.next()) {
                Account acc = new Account(rs.getInt(1),
                        rs.getString(2), rs.getString(3),
                        rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7),
                        rs.getInt(8));
                list.add(acc);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }

    public List<OrderDetails> getListOrderById(int orderID) {

        List<OrderDetails> list = new ArrayList<>();
        try {
            String query = "SELECT * from OrderDetails where orderID = ?";
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, orderID);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new OrderDetails(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4)));
            }
            return list;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return list;
    }

    public List<Product> pagingProduct(int index) {
        List<Product> list = new ArrayList<>();
        String query = "select p.* from Product p left join Saleoff s\n"
                + "on p.productID = s.productID\n"
                + "where s.saleOff is NULL\n"
                + " and p.isDelete = 0\n"
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

    public int getTotalSrearch(String name) {
        String txt = "%" + name + "%";
        String query = "select count(*) from Product c\n"
                + "where c.title Like ?";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, txt);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public List<Product> pagingSearchProduct(int index, String name) {
        List<Product> list = new ArrayList<>();
        String query = "select p.* from Product p, ImportDetails i\n"
                + "where p.title Like ?\n"
                + "	and p.productID = i.productID\n"
                + "ORDER BY p.productID\n"
                + "OFFSET ? ROWS FETCH NEXT 6 ROWS ONLY;";
        try {
            con = new DBContext().getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, "%" + name + "%");
            ps.setInt(2, (index - 1) * 6);
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

}
