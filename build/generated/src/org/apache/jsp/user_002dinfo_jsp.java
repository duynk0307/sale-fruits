package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_002dinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html :class=\"{ 'theme-dark': dark }\" x-data=\"data()\" lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("        <title>Quản Lí Người Dùng</title>\n");
      out.write("        <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css2?family=Inter:wght@400;500;600;700;800&display=swap\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/tailwind.output.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/infopage.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/css/bootstrap.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-alpha1/dist/js/bootstrap.bundle.min.js\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"/>\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdn.jsdelivr.net/gh/alpinejs/alpine@v2.x.x/dist/alpine.min.js\"\n");
      out.write("            defer\n");
      out.write("        ></script>\n");
      out.write("        <script src=\"./js/init-alpine.js\"></script>\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.css\"\n");
      out.write("            />\n");
      out.write("        <script\n");
      out.write("            src=\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.9.3/Chart.min.js\"\n");
      out.write("            defer\n");
      out.write("        ></script>\n");
      out.write("        <script src=\"./js/charts-lines.js\" defer></script>\n");
      out.write("        <script src=\"./js/charts-pie.js\" defer></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #gradient-custom-4 {\n");
      out.write("                /* fallback for old browsers */\n");
      out.write("                background: #84fab0;\n");
      out.write("\n");
      out.write("                /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("                background: -webkit-linear-gradient(to right, rgb(241, 195, 135), rgb(240, 255, 24));\n");
      out.write("\n");
      out.write("                /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("                background: linear-gradient(to right, rgb(250, 218, 132), rgb(255, 170, 59))\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- New Table -->\n");
      out.write("        <section class=\"vh-100 bg-image\" id=\"gradient-custom-4\" > \n");
      out.write("            <div class=\"w-full overflow-hidden rounded-lg shadow-xs\">\n");
      out.write("                <div class=\"w-full overflow-x-auto\">\n");
      out.write("                    <div class=\"container rounded bg-white mt-5 mb-5\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-3 border-right\">\n");
      out.write("                                <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" width=\"150px\" src=\"https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg\"><span class=\"font-weight-bold\">Edogaru</span><span class=\"text-black-50\">edogaru@mail.com.my</span><span> </span></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-5 border-right\">\n");
      out.write("                                <div class=\"p-3 py-5\">\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                                        <h4 class=\"text-right\">Cập Nhật Hồ Sơ</h4>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mt-2\">\n");
      out.write("                                        <div class=\"col-md-6\"><label class=\"labels\">Tên:</label><input type=\"text\" class=\"form-control\" placeholder=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.ten}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row mt-3\">\n");
      out.write("                                        <div class=\"col-md-12\"><label class=\"labels\">Số điện thoại</label><input type=\"text\" class=\"form-control\" placeholder=\"enter phone number\" value=\"\"></div>\n");
      out.write("                                        <div class=\"col-md-12\"><label class=\"labels\">Địa chỉ</label><input type=\"text\" class=\"form-control\" placeholder=\"enter address line 2\" value=\"\"></div>\n");
      out.write("                                        <div class=\"col-md-12\"><label class=\"labels\">Area</label><input type=\"text\" class=\"form-control\" placeholder=\"enter address line 2\" value=\"\"></div>\n");
      out.write("                                        <div class=\"col-md-12\"><label class=\"labels\">Email</label><input type=\"text\" class=\"form-control\" placeholder=\"enter email id\" value=\"\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mt-5 text-center\"><button class=\"btn btn-primary profile-button\" type=\"button\">Save Profile</button></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"p-3 py-5\">\n");
      out.write("                                    <div class=\"d-flex justify-content-between align-items-center experience\"><span>Edit Experience</span><span class=\"border px-3 p-1 add-experience\"><i class=\"fa fa-plus\"></i>&nbsp;Experience</span></div><br>\n");
      out.write("                                    <div class=\"col-md-12\"><label class=\"labels\">Experience in Designing</label><input type=\"text\" class=\"form-control\" placeholder=\"experience\" value=\"\"></div> <br>\n");
      out.write("                                    <div class=\"col-md-12\"><label class=\"labels\">Additional Details</label><input type=\"text\" class=\"form-control\" placeholder=\"additional details\" value=\"\"></div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
