/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlServlet;

import dao.DAO;
import entity.Account;
import entity.CartItem;
import entity.CartSession;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ACER
 */
@WebServlet(name = "searchControl", urlPatterns = {"/search"})
public class searchControl extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        String txtSearch = request.getParameter("txtS");
        String indexPage = request.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);
        
        DAO dao = new DAO();
        List<Category> catePro = dao.getListCategory();
        List<Product> lastPro = dao.getLastProduct();
        
        int count;
        boolean choise = false;
        count = dao.getTotalSrearch(txtSearch);
        int endPage = count/6;
        if (count % 6 != 0) {
            endPage++;
        }
        List<Product> searchPro = dao.pagingSearchProduct(index, txtSearch);
        
        request.setAttribute("endP", endPage);
        request.setAttribute("tag", index);
        request.setAttribute("isFilter", choise);
        request.setAttribute("txtS", txtSearch);
        request.setAttribute("listPro", searchPro);
        request.setAttribute("lastPro", lastPro);
        request.setAttribute("category1", catePro);
        
        // kiem soat da login hay chua
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
        
        request.getRequestDispatcher("shop-grid.jsp").forward(request, response);
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
