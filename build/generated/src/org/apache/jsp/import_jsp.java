package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class import_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Danh Sách Đơn Hàng</title>\n");
      out.write("        <!-- Css Styles -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/icon?family=Material+Icons\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Inter:wght@200;300;400;600;900&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/elegant-icons.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/nice-select.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                color: #566787;\n");
      out.write("                background: #f5f5f5;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("            }\n");
      out.write("            .table-responsive {\n");
      out.write("                margin: 30px 0;\n");
      out.write("            }\n");
      out.write("            .table-wrapper {\n");
      out.write("                min-width: 1000px;\n");
      out.write("                background: #fff;\n");
      out.write("                padding: 20px;\n");
      out.write("                box-shadow: 0 1px 1px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .table-title {\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("                margin: 0 0 10px;\n");
      out.write("                min-width: 100%;\n");
      out.write("            }\n");
      out.write("            .table-title h2 {\n");
      out.write("                margin: 8px 0 0;\n");
      out.write("                font-size: 22px;\n");
      out.write("            }\n");
      out.write("            .search-box {\n");
      out.write("                position: relative;        \n");
      out.write("                float: right;\n");
      out.write("            }\n");
      out.write("            .search-box input {\n");
      out.write("                height: 34px;\n");
      out.write("                border-radius: 20px;\n");
      out.write("                padding-left: 35px;\n");
      out.write("                border-color: #ddd;\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("            .search-box input:focus {\n");
      out.write("                border-color: #3FBAE4;\n");
      out.write("            }\n");
      out.write("            .search-box i {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                position: absolute;\n");
      out.write("                font-size: 19px;\n");
      out.write("                top: 8px;\n");
      out.write("                left: 10px;\n");
      out.write("            }\n");
      out.write("            table.table tr th, table.table tr td {\n");
      out.write("                border-color: #e9e9e9;\n");
      out.write("            }\n");
      out.write("            table.table-striped tbody tr:nth-of-type(odd) {\n");
      out.write("                background-color: #fcfcfc;\n");
      out.write("            }\n");
      out.write("            table.table-striped.table-hover tbody tr:hover {\n");
      out.write("                background: #f5f5f5;\n");
      out.write("            }\n");
      out.write("            table.table th i {\n");
      out.write("                font-size: 13px;\n");
      out.write("                margin: 0 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            table.table td:last-child {\n");
      out.write("                width: 130px;\n");
      out.write("            }\n");
      out.write("            table.table td a {\n");
      out.write("                color: #a0a5b1;\n");
      out.write("                display: inline-block;\n");
      out.write("                margin: 0 5px;\n");
      out.write("            }\n");
      out.write("            table.table td a.view {\n");
      out.write("                color: #03A9F4;\n");
      out.write("            }\n");
      out.write("            table.table td a.edit {\n");
      out.write("                color: #FFC107;\n");
      out.write("            }\n");
      out.write("            table.table td a.delete {\n");
      out.write("                color: #E34724;\n");
      out.write("            }\n");
      out.write("            table.table td i {\n");
      out.write("                font-size: 19px;\n");
      out.write("            }    \n");
      out.write("            .pagination {\n");
      out.write("                float: right;\n");
      out.write("                margin: 0 0 5px;\n");
      out.write("            }\n");
      out.write("            .pagination li a {\n");
      out.write("                border: none;\n");
      out.write("                font-size: 95%;\n");
      out.write("                width: 30px;\n");
      out.write("                height: 30px;\n");
      out.write("                color: #999;\n");
      out.write("                margin: 0 2px;\n");
      out.write("                line-height: 30px;\n");
      out.write("                border-radius: 30px !important;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            .pagination li a:hover {\n");
      out.write("                color: #666;\n");
      out.write("            }\t\n");
      out.write("            .pagination li.active a {\n");
      out.write("                background: #03A9F4;\n");
      out.write("            }\n");
      out.write("            .pagination li.active a:hover {        \n");
      out.write("                background: #0397d6;\n");
      out.write("            }\n");
      out.write("            .pagination li.disabled i {\n");
      out.write("                color: #ccc;\n");
      out.write("            }\n");
      out.write("            .pagination li i {\n");
      out.write("                font-size: 16px;\n");
      out.write("                padding-top: 6px\n");
      out.write("            }\n");
      out.write("            .hint-text {\n");
      out.write("                float: left;\n");
      out.write("                margin-top: 6px;\n");
      out.write("                font-size: 95%;\n");
      out.write("            } \n");
      out.write("            form {\n");
      out.write("                border: 5px solid #f1f1f1;\n");
      out.write("            }\n");
      out.write("            input[type=text], input[type=password] {\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 16px 8px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                display: inline-block;\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            .icon {\n");
      out.write("                font-size: 50px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                color: #4286f4;\n");
      out.write("            }\n");
      out.write("            button {\n");
      out.write("                background-color: #4286f4;\n");
      out.write("                color: white;\n");
      out.write("                padding: 14px 0;\n");
      out.write("                margin: 10px 0;\n");
      out.write("                border: none;\n");
      out.write("                cursor: grab;\n");
      out.write("                width: 48%;\n");
      out.write("            }\n");
      out.write("            h1 {\n");
      out.write("                text-align:center;\n");
      out.write("                font-size:18px;\n");
      out.write("            }\n");
      out.write("            button:hover {\n");
      out.write("                opacity: 0.8;\n");
      out.write("            }\n");
      out.write("            .formcontainer {\n");
      out.write("                text-align: center;\n");
      out.write("                margin: 24px 50px 12px;\n");
      out.write("            }\n");
      out.write("            .container {\n");
      out.write("                padding: 16px 0;\n");
      out.write("                text-align:left;\n");
      out.write("            }\n");
      out.write("            span.psw {\n");
      out.write("                float: right;\n");
      out.write("                padding-top: 0;\n");
      out.write("                padding-right: 15px;\n");
      out.write("            }\n");
      out.write("            .success {\n");
      out.write("                border: 1px solid;\n");
      out.write("                margin: 10px 0px;\n");
      out.write("                padding: 15px 10px 15px 50px;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                background-position: 10px center;\n");
      out.write("            }\n");
      out.write("            .success {\n");
      out.write("                color: #4F8A10;\n");
      out.write("                background-color: #DFF2BF;\n");
      out.write("                background-image: url('https://i.imgur.com/Q9BGTuy.png');\n");
      out.write("            }\n");
      out.write("            /* Change styles for span on extra small screens */\n");
      out.write("            @media screen and (max-width: 300px) {\n");
      out.write("                span.psw {\n");
      out.write("                    display: block;\n");
      out.write("                    float: none;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </head>\n");
      out.write("        <body>\n");
      out.write("            <header class=\"header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3\">\n");
      out.write("                            <div class=\"header__logo\">\n");
      out.write("                                <a href=\"./HomeControl\"><img src=\"img/logo.png\" alt=\"\"></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-7\">\n");
      out.write("                            <nav class=\"header__menu\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"./HomeControl\">Trang chủ</a></li>\n");
      out.write("                                    <li><a href=\"./user\" class=\"active\" >Người dùng</a></li>\n");
      out.write("                                    <li><a href=\"./product\">Sản phẩm</a></li>\n");
      out.write("                                    <li><a href=\"./allorder\">Đơn hàng</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </nav>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"humberger__open\">\n");
      out.write("                        <i class=\"fa fa-bars\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"container-xl\">\n");
      out.write("                <div class=\"table-responsive\">\n");
      out.write("                    <div class=\"table-wrapper\">\n");
      out.write("                        <div class=\"table-title\">\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <div class=\"col-sm-8\"><h2>Danh Sách  <b>Đơn Hàng</b></h2></div>\n");
      out.write("                                <div class=\"col-sm-4\">\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"table table-striped table-hover table-bordered\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>ID</th>\n");
      out.write("                                    <th>Order Date </th>\n");
      out.write("                                    <th>User ID</th>\n");
      out.write("                                    <th>Delivered</th>\n");
      out.write("                                    <th>Actions</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"clearfix\">\n");
      out.write("                            <div class=\"hint-text\">Showing <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${shownumber}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> out of <b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalOrder}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b> entries</div>\n");
      out.write("                            <ul class=\"pagination\">\n");
      out.write("                                <li class=\"page-item disabled\"><i class=\"fa fa-angle-double-left\"></i></li>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                <li class=\"page-item disabled\"><i class=\"fa fa-angle-double-right\"></i></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("            <form action=\"addproduct?index=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activePage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"myForm\" onsubmit=\"return validateForm()\" method=\"POST\">\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                <div class=\"icon\">\n");
      out.write("                    <i class=\"fa fa-product-hunt\"></i>\n");
      out.write("                </div>\n");
      out.write("                <h1 style=\"font-size:30px\">ADD NEW PRODUCT</h1>\n");
      out.write("                <div class=\"formcontainer\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <label for=\"ipID\"><strong>Import ID</strong></label>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter product ID\" minlength=\"3\" maxlength=\"4\" name=\"ipID\" required>\n");
      out.write("                        <div class=\"alert-danger\" id=\"errid\"></div>\n");
      out.write("                        <label for=\"ipDate\"><strong>Import Date</strong></label>\n");
      out.write("                        <input type=\"text\" placeholder=\"Enter Import Date\" name=\"ipDate\" value=\"");
 java.time.LocalDate.now().toString();
      out.write("\" readonly>\n");
      out.write("                        <label for=\"userID\"><strong>User ID</strong></label>\n");
      out.write("                        <input type=\"text\" name=\"userID\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\"><strong>ADD PRODUCT</strong></button>\n");
      out.write("                    <br>\n");
      out.write("                    <button type=\"reset\"><strong>RESET</strong></button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <!-- Js Plugins -->\n");
      out.write("            <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("            <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"js/jquery.nice-select.min.js\"></script>\n");
      out.write("            <script src=\"js/jquery-ui.min.js\"></script>\n");
      out.write("            <script src=\"js/jquery.slicknav.js\"></script>\n");
      out.write("            <script src=\"js/mixitup.min.js\"></script>\n");
      out.write("            <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("            <script src=\"js/main.js\"></script>\n");
      out.write("        </body>\n");
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
        out.write("\n");
        out.write("                                        <li><a href=\"./userinfo\"><i class=\"fa fa-user\"></i>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("  </a></li>\n");
        out.write("                                        <li><a href=\"Logout\"><i class=\"fa fa-sign-out\"></i>Đăng xuất</a></li>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listIp}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("li");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.ipID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.ipDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.userID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                        ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                            <td>\n");
          out.write("                                                <a href=\"orderdetails?orderID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" title=\"View\" data-toggle=\"tooltip\"><i class=\"fa fa-eye\"></i></a>\n");
          out.write("                                            <a href=\"delivered?orderID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.orderID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"edit\" title=\"Delivered\" data-toggle=\"tooltip\"><i class=\"fa fa-check\"></i></a>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
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

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.delivered != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<td>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.delivered}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td>");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${li.delivered == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<td>Đơn hàng chưa giao</td>");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
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
          out.write("\n");
          out.write("                                    <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${activePage == i ? \"active\": \"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a href=\"product?index=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"page-link\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
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
}
