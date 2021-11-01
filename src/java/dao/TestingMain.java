/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Account;
import entity.Category;
import entity.Product;
import java.util.List;

/**
 *
 * @author group5
 */
public class TestingMain {

    public static void main(String[] args) {
        DAO dao = new DAO();
//        List<Product> pro = dao.getListProduct();
//
//        for (Product product : pro) {
//            System.out.println(product.toString());
//        }
        List<Category> cate = dao.getListCategory();

        for (Category cat : cate) {
            System.out.println(cat.toString());
        }
    }
}
