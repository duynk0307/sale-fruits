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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Minh Nhat
 */
@WebServlet(name = "detailsControl", urlPatterns = {"/detailsControl"})
public class detailsControl extends HttpServlet {
    
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
        //processRequest(request, response);
        DAO dao = new DAO();
        List<Category> catePro = dao.getListCategory();
        String proId = request.getParameter("sid");
        Product p = dao.getProductByID(proId);
        HttpSession session = request.getSession();
        List<Product> rltProduct = new ArrayList<>();;
        try {
            session.getAttribute("rltProduct");
            rltProduct.addAll((ArrayList<Product>)session.getAttribute("rltProduct"));
        } catch (Exception e) {
        }
        //Xử lý Related Product
        List<Product> rltPro = dao.getRelatedProduct(rltProduct, p);
        //Kết thúc xử lý Related Product
        
        session.setAttribute("rltProduct", rltProduct);
        request.setAttribute("rltPro", rltPro);
        request.setAttribute("pd", p);
        request.setAttribute("category1", catePro);
        
        // kiem soat da login hay chua
        Account acc = (Account) session.getAttribute("account");
        if (acc != null) {
            List<CartItem> cItem = dao.getListCartItem(acc.getUserID());
            CartSession cSession = dao.getCartSession(acc.getUserID());
            if (cItem != null) {
                request.setAttribute("cItem", cItem);
                request.setAttribute("cSession", cSession);
            }
        }
        request.getRequestDispatcher("shop-details.jsp").forward(request, response);
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
