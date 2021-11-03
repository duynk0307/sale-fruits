/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlServlet;

import dao.DAO;
import entity.Account;
import entity.Banner;
import entity.CartItem;
import entity.CartSession;
import entity.Category;
import entity.Product;
import entity.Sources;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nguyen Khanh Duy;
 */
public class HomeControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        // get data from database
        DAO dao = new DAO();
        List<Product> product = dao.getListProduct();
        List<Product> lastPro = dao.getLastProduct();
        List<Product> bestPro = dao.getBestsellingProduct();
        List<Product> reviewPro = dao.getReviewProduct();
        List<Sources> srcPro = dao.getLogoSourses();
        List<Category> cate = dao.getListCategory();
        List<Category> featPro = dao.getFeaturedProduct();
        List<Banner> banner = dao.getListBanner();
        for (Sources s : srcPro) {
            System.out.println(s.toString());
        }
        // set data to jsp page
        request.setAttribute("lastPro", lastPro);
        request.setAttribute("bestPro", bestPro);
        request.setAttribute("rewPro", reviewPro);
        request.setAttribute("Logo1", srcPro);
        request.setAttribute("listFeat", featPro);
        request.setAttribute("listBnr", banner);
        request.setAttribute("listPro", product);
        request.setAttribute("listCate", cate);

        System.out.println(request.getRequestURL());
        System.out.println(request.getRequestURI());

        HttpSession session = request.getSession();
        Account acc = (Account) session.getAttribute("account");
        if (acc != null) {
            List<CartItem> cItem = dao.getListCartItem(acc.getUserID());
            CartSession cSession = dao.getCartSession(acc.getUserID());
            if (cItem != null) {
                request.setAttribute("cItem", cItem);
                request.setAttribute("cSession", cSession);
            }
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
