package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <title>Product Detail</title>\r\n");
      out.write("        <!-- Css Styles -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\r\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("                color: #566787;\r\n");
      out.write("                background: #f5f5f5;\r\n");
      out.write("                font-family: 'Roboto', sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            .table-responsive {\r\n");
      out.write("                margin: 30px 0;\r\n");
      out.write("            }\r\n");
      out.write("            .table-wrapper {\r\n");
      out.write("                min-width: 1000px;\r\n");
      out.write("                background: #fff;\r\n");
      out.write("                padding: 20px;\r\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\r\n");
      out.write("            }\r\n");
      out.write("            .table-title {\r\n");
      out.write("                padding-bottom: 10px;\r\n");
      out.write("                margin: 0 0 10px;\r\n");
      out.write("                min-width: 100%;\r\n");
      out.write("            }\r\n");
      out.write("            .table-title h2 {\r\n");
      out.write("                margin: 8px 0 0;\r\n");
      out.write("                font-size: 22px;\r\n");
      out.write("            }\r\n");
      out.write("            .search-box {\r\n");
      out.write("                position: relative;        \r\n");
      out.write("                float: right;\r\n");
      out.write("            }\r\n");
      out.write("            .search-box input {\r\n");
      out.write("                height: 34px;\r\n");
      out.write("                border-radius: 20px;\r\n");
      out.write("                padding-left: 35px;\r\n");
      out.write("                border-color: #ddd;\r\n");
      out.write("                box-shadow: none;\r\n");
      out.write("            }\r\n");
      out.write("            .search-box input:focus {\r\n");
      out.write("                border-color: #3FBAE4;\r\n");
      out.write("            }\r\n");
      out.write("            .search-box i {\r\n");
      out.write("                color: #a0a5b1;\r\n");
      out.write("                position: absolute;\r\n");
      out.write("                font-size: 19px;\r\n");
      out.write("                top: 8px;\r\n");
      out.write("                left: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table tr th, table.table tr td {\r\n");
      out.write("                border-color: #e9e9e9;\r\n");
      out.write("            }\r\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\r\n");
      out.write("                background-color: #fcfcfc;\r\n");
      out.write("            }\r\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\r\n");
      out.write("                background: #f5f5f5;\r\n");
      out.write("            }\r\n");
      out.write("            table.table th i {\r\n");
      out.write("                font-size: 13px;\r\n");
      out.write("                margin: 0 5px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td:last-child {\r\n");
      out.write("                width: 130px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a {\r\n");
      out.write("                color: #a0a5b1;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                margin: 0 5px;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a.view {\r\n");
      out.write("                color: #03A9F4;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a.edit {\r\n");
      out.write("                color: #FFC107;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td a.delete {\r\n");
      out.write("                color: #E34724;\r\n");
      out.write("            }\r\n");
      out.write("            table.table td i {\r\n");
      out.write("                font-size: 19px;\r\n");
      out.write("            }    \r\n");
      out.write("            .pagination {\r\n");
      out.write("                float: right;\r\n");
      out.write("                margin: 0 0 5px;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li a {\r\n");
      out.write("                border: none;\r\n");
      out.write("                font-size: 95%;\r\n");
      out.write("                width: 30px;\r\n");
      out.write("                height: 30px;\r\n");
      out.write("                color: #999;\r\n");
      out.write("                margin: 0 2px;\r\n");
      out.write("                line-height: 30px;\r\n");
      out.write("                border-radius: 30px !important;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                padding: 0;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li a:hover {\r\n");
      out.write("                color: #666;\r\n");
      out.write("            }\t\r\n");
      out.write("            .pagination li.active a {\r\n");
      out.write("                background: #03A9F4;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li.active a:hover {        \r\n");
      out.write("                background: #0397d6;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li.disabled i {\r\n");
      out.write("                color: #ccc;\r\n");
      out.write("            }\r\n");
      out.write("            .pagination li i {\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                padding-top: 6px\r\n");
      out.write("            }\r\n");
      out.write("            .hint-text {\r\n");
      out.write("                float: left;\r\n");
      out.write("                margin-top: 6px;\r\n");
      out.write("                font-size: 95%;\r\n");
      out.write("            } \r\n");
      out.write("            form {\r\n");
      out.write("                border: 5px solid #f1f1f1;\r\n");
      out.write("            }\r\n");
      out.write("            input[type=text], input[type=password] {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                padding: 16px 8px;\r\n");
      out.write("                margin: 8px 0;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                border: 1px solid #ccc;\r\n");
      out.write("                box-sizing: border-box;\r\n");
      out.write("            }\r\n");
      out.write("            .icon {\r\n");
      out.write("                font-size: 50px;\r\n");
      out.write("                display: flex;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                color: #4286f4;\r\n");
      out.write("            }\r\n");
      out.write("            button {\r\n");
      out.write("                background-color: #4286f4;\r\n");
      out.write("                color: white;\r\n");
      out.write("                padding: 14px 0;\r\n");
      out.write("                margin: 10px 0;\r\n");
      out.write("                border: none;\r\n");
      out.write("                cursor: grab;\r\n");
      out.write("                width: 48%;\r\n");
      out.write("            }\r\n");
      out.write("            h1 {\r\n");
      out.write("                text-align:center;\r\n");
      out.write("                font-size:18px;\r\n");
      out.write("            }\r\n");
      out.write("            button:hover {\r\n");
      out.write("                opacity: 0.8;\r\n");
      out.write("            }\r\n");
      out.write("            .formcontainer {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                margin: 24px 50px 12px;\r\n");
      out.write("            }\r\n");
      out.write("            .container {\r\n");
      out.write("                padding: 16px 0;\r\n");
      out.write("                text-align:left;\r\n");
      out.write("            }\r\n");
      out.write("            span.psw {\r\n");
      out.write("                float: right;\r\n");
      out.write("                padding-top: 0;\r\n");
      out.write("                padding-right: 15px;\r\n");
      out.write("            }\r\n");
      out.write("            .success {\r\n");
      out.write("                border: 1px solid;\r\n");
      out.write("                margin: 10px 0px;\r\n");
      out.write("                padding: 15px 10px 15px 50px;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-position: 10px center;\r\n");
      out.write("            }\r\n");
      out.write("            .success {\r\n");
      out.write("                color: #4F8A10;\r\n");
      out.write("                background-color: #DFF2BF;\r\n");
      out.write("                background-image: url('https://i.imgur.com/Q9BGTuy.png');\r\n");
      out.write("            }\r\n");
      out.write("            /* Change styles for span on extra small screens */\r\n");
      out.write("            @media screen and (max-width: 300px) {\r\n");
      out.write("                span.psw {\r\n");
      out.write("                    display: block;\r\n");
      out.write("                    float: none;\r\n");
      out.write("                }\r\n");
      out.write("            </style>\r\n");
      out.write("            <script>\r\n");
      out.write("                $(document).ready(function () {\r\n");
      out.write("                    $('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("                });\r\n");
      out.write("                function onDelete() {\r\n");
      out.write("                    if (confirm(\"Are you sure you want to delete?\")) {\r\n");
      out.write("                        return true;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("                function validateForm() {\r\n");
      out.write("\r\n");
      out.write("                    // lay value\r\n");
      out.write("                    let productID = document.forms[\"myForm\"][\"productID\"].value;\r\n");
      out.write("                    let salePrice = document.forms[\"myForm\"][\"salePrice\"].value;\r\n");
      out.write("                    var error = false;\r\n");
      out.write("\r\n");
      out.write("                    if (/^[a-zA-Z0-9]{3,4}$/.test(productID) === false) {\r\n");
      out.write("                        document.getElementById(\"errid\").innerHTML = \"Product id from 3-4 characters and not contain special characters\";\r\n");
      out.write("                        error = true;\r\n");
      out.write("                    } else {\r\n");
      out.write("                        document.getElementById(\"errid\").innerHTML = \"\";\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if (typeof salePrice === 'number') {\r\n");
      out.write("                        document.getElementById(\"errPrice\").innerHTML = \"\";\r\n");
      out.write("                    } else {\r\n");
      out.write("                        document.getElementById(\"errPrice\").innerHTML = \"Price must be a number\";\r\n");
      out.write("                        error = true;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    if (error) {\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("        </head>\r\n");
      out.write("        <body>\r\n");
      out.write("            <header class=\"header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-3\">\r\n");
      out.write("                            <div class=\"header__logo\">\r\n");
      out.write("                                <a href=\"./HomeControl\"><img src=\"img/logo.png\" alt=\"\"></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-7\">\r\n");
      out.write("                            <nav class=\"header__menu\">\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"./HomeControl\">Trang chủ</a></li>\r\n");
      out.write("                                    <li><a href=\"./user\" class=\"active\" >Người dùng</a></li>\r\n");
      out.write("                                    <li><a href=\"./product\">Sản phẩm</a></li>\r\n");
      out.write("                                    <li><a href=\"./allorder\">Đơn hàng</a></li>\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </nav>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"humberger__open\">\r\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header>\r\n");
      out.write("            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <div class=\"container-xl\">\r\n");
      out.write("                <div class=\"table-responsive\">\r\n");
      out.write("                    <div class=\"table-wrapper\">\r\n");
      out.write("                        <div class=\"table-title\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-sm-8\"><h2>Chi Tiết  <b>Sản Phẩm</b></h2></div>\r\n");
      out.write("                                <div class=\"col-sm-4\">\r\n");
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <table class=\"table table-striped table-hover table-bordered\">\r\n");
      out.write("                            <thead>\r\n");
      out.write("                                <tr>\r\n");
      out.write("                                    <th>ID</th>\r\n");
      out.write("                                    <th>Name </th>\r\n");
      out.write("                                    <th>Title</th>\r\n");
      out.write("                                    <th>Category</th>\r\n");
      out.write("                                    <th>Sale Price</i></th>\r\n");
      out.write("                                    <th>Inventory</i></th>\r\n");
      out.write("                                    <th>Actions</th>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                            </thead>\r\n");
      out.write("                            <tbody>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </tbody>\r\n");
      out.write("                        </table>\r\n");
      out.write("                        <div class=\"clearfix\">\r\n");
      out.write("                            <div class=\"hint-text\">Showing <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shownumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> out of <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPro}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> entries</div>\r\n");
      out.write("                            <ul class=\"pagination\">\r\n");
      out.write("                                <li class=\"page-item disabled\"><i class=\"fa fa-angle-double-left\"></i></li>\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <li class=\"page-item disabled\"><i class=\"fa fa-angle-double-right\"></i></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>  \r\n");
      out.write("            </div> \r\n");
      out.write("\r\n");
      out.write("            <form action=\"signup\" name=\"myForm\" onsubmit=\"return validateForm()\" method=\"POST\">\r\n");
      out.write("                <br>\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"icon\">\r\n");
      out.write("                    <i class=\"fa fa-product-hunt\"></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h1 style=\"font-size:30px\">ADD NEW PRODUCT</h1>\r\n");
      out.write("                <div class=\"formcontainer\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <label for=\"productID\"><strong>ID</strong></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter product ID\" minlength=\"3\"name=\"productID\" required>\r\n");
      out.write("                        <div class=\"alert-danger\" id=\"errid\"></div>\r\n");
      out.write("                        <label for=\"productName\"><strong>Product Name</strong></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Product Name\" name=\"productName\" required>\r\n");
      out.write("                        <label for=\"image\"><strong>Image</strong></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Image\" name=\"image\" required>\r\n");
      out.write("                        <label for=\"title\"><strong>Title</strong></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Title\" name=\"title\" required>\r\n");
      out.write("                        <label for=\"description\"><strong>Description</strong></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Description\" name=\"description\" required>\r\n");
      out.write("                        <label for=\"address\"><strong>Category</strong></label>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <select name=\"cateID\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <br>\r\n");
      out.write("                        <label for=\"salePrice\"><strong>Sale Price</strong></label>\r\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Sale Price\" name=\"salePrice\" required>\r\n");
      out.write("                        <div class=\"alert-danger\" id=\"errPrice\"></div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <button type=\"submit\"><strong>ADD PRODUCT</strong></button>\r\n");
      out.write("                    <br>\r\n");
      out.write("                    <button type=\"reset\"><strong>RESET</strong></button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("\r\n");
      out.write("            <!-- Js Plugins -->\r\n");
      out.write("            <script src=\"js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("            <script src=\"js/jquery.nice-select.min.js\"></script>\r\n");
      out.write("            <script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("            <script src=\"js/jquery.slicknav.js\"></script>\r\n");
      out.write("            <script src=\"js/mixitup.min.js\"></script>\r\n");
      out.write("            <script src=\"js/owl.carousel.min.js\"></script>\r\n");
      out.write("            <script src=\"js/main.js\"></script>\r\n");
      out.write("        </body>\r\n");
      out.write("    </html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                        <li><a href=\"./userinfo\"><i class=\"fa fa-user\"></i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("  </a></li>\r\n");
        out.write("                                        <li><a href=\"Logout\"><i class=\"fa fa-sign-out\"></i>Đăng xuất</a></li>\r\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${deleteSucess != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                <div class=\"success\">\r\n");
        out.write("                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${deleteSucess}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\r\n");
        out.write("                </div>\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPro}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("li");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <tr>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.salePrice}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.inventory}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                        <td>\r\n");
          out.write("                                            <a href=\"product-info?productID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" title=\"Edit\" data-toggle=\"tooltip\"><i class=\"fa fa-edit\"></i></a>\r\n");
          out.write("                                            <a href=\"deleteproduct?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.productID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"delete\" title=\"Delete\" onclick=\"return onDelete()\"data-toggle=\"tooltip\"><i class=\"material-icons\">&#xE872;</i></a>\r\n");
          out.write("                                        </td>\r\n");
          out.write("                                    </tr>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${endP}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activePage == i ? \"active\": \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"product?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"page-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("c");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${c.cateName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}
