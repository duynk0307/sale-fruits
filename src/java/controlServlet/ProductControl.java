/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlServlet;

import dao.DAO;
import entity.Account;
import entity.Category;
import entity.Product;
import java.io.IOException;
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
@WebServlet(name = "ProductControl", urlPatterns = {"/product"})
public class ProductControl extends HttpServlet {

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
        String indexPage = request.getParameter("index");
        if (indexPage == null) {
            indexPage = "1";
        }
        int index = Integer.parseInt(indexPage);

        int count = dao.getTotalProduct();
        int endPage = count / 6;
        if (count % 6 != 0) {
            endPage++;
        }
        List<Product> listPro = dao.pagingProduct(index);

        List<Category> listCate = dao.getListCategory();
        //kiem soat da login hay chua
        HttpSession session = request.getSession();
        Account acc = (Account) session.getAttribute("account");
        if (acc != null) {
            if (acc.getRoleID() == 0) {
                response.sendRedirect("HomeControl");
            } else {
                request.setAttribute("user", acc);
                String deleteMess = request.getParameter("deleteSuccess");
                if (deleteMess != null) {
                    request.setAttribute("deleteSuccess", "X??a t??i kho???n th??nh c??ng");
                }
                request.setAttribute("listCate", listCate);
                request.setAttribute("shownumber", listPro.size());
                request.setAttribute("activePage", index);
                request.setAttribute("endP", endPage);
                request.setAttribute("totalPro", count);

                request.setAttribute("listPro", listPro);

                request.getRequestDispatcher("product.jsp").forward(request, response);
            }
        } else {
            response.sendRedirect("HomeControl");
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
