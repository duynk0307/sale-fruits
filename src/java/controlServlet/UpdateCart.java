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
 * @author Nguyen Khanh Duy;
 */
@WebServlet(name = "UpdateCart", urlPatterns = {"/update"})
public class UpdateCart extends HttpServlet {

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
        
        DAO dao = new DAO();
        List<Category> cate = dao.getListCategory();

        request.setAttribute("listCate", cate);

        HttpSession session = request.getSession();
        Account acc = (Account) session.getAttribute("account");
        if (acc != null) {
            List<CartItem> cItem = dao.getListCartItem(acc.getUserID());
            CartSession cSession = dao.getCartSession(acc.getUserID());
            if (cItem.isEmpty()) {
                cItem = new ArrayList<>();
            } 
            
            //update so luong san pham trong gio
            for (int i = 0; i < cItem.size(); i++) {
                String quantity = request.getParameter("product"+i);
                int quanti = Integer.parseInt(quantity);
                Product product = dao.getProductByID(cItem.get(i).getProductID());
                dao.updateCartItem(cItem.get(i).getCartID(), quanti, product.getSalePrice());
            }
            
            List<CartItem> cItem1 = dao.getListCartItem(acc.getUserID());
            CartSession cSession1 = dao.getCartSession(acc.getUserID());
            if (cItem1.isEmpty()) {
                cItem1 = new ArrayList<>();
            } 
            // cap nhat tong tien gio hang
            dao.setCartTotal(dao.getCartTotal(cSession1.getSessionID()), cSession1.getSessionID());
            
            
            List<CartItem> cItem2 = dao.getListCartItem(acc.getUserID());
            CartSession cSession2 = dao.getCartSession(acc.getUserID());
            
            request.setAttribute("cItem", cItem2);
            request.setAttribute("cSession", cSession2);
            request.getRequestDispatcher("shoping-cart.jsp").forward(request, response);
        } else {
            response.sendRedirect("login.jsp");
        }
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
