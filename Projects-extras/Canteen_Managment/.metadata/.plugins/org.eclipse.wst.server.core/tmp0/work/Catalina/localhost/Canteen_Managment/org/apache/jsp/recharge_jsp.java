/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-10-30 17:23:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recharge_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Recharge...</title>\n");
      out.write("\t<meta name=\"keywords\" content=\"\" />\n");
      out.write("\t<meta name=\"description\" content=\"\" />\n");
      out.write("<!-- \n");
      out.write("Sonic Template \n");
      out.write("http://www.templatemo.com/preview/templatemo_394_sonic \n");
      out.write("-->\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"initial-scale=1\">\n");
      out.write("    \n");
      out.write("\t<link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/templatemo_misc.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/templatemo_style.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/feedback.css\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/updateItem.css\">\n");
      out.write("\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t<script src=\"js/modernizr.custom.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function redirect(cnt) {\n");
      out.write("  window.location = 'index?rqst='+ cnt;\n");
      out.write("  return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("\t<div id=\"main-sidebar\" class=\"hidden-xs hidden-sm\">\n");
      out.write("\t\t<div class=\"logo\">\n");
      out.write("\t\t\t<a href=\"#\"><h1>e-CAN</h1></a>\n");
      out.write("\t\t\t<span>Online Catering System</span>\n");
      out.write("\t\t</div> <!-- /.logo -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"navigation\">\n");
      out.write("\t        <ul class=\"main-menu\">\n");
      out.write("\t            \n");
      out.write("\t            <li class=\"about\"><a onclick=\"return redirect('All Orders')\" href=\"#\">All Orders</a></li>\n");
      out.write("\t            <li class=\"services\"><a onclick=\"return redirect('Available Items')\" href=\"#\">Available Items</a></li>\n");
      out.write("\t            <li class=\"portfolio\"><a onclick=\"return redirect('Change Availability')\" href=\"#\">Change Availability</a></li>\n");
      out.write("\t            <li class=\"contact\"><a onclick=\"return redirect('Update an Item')\" href=\"#\">Update An Item</a></li>\n");
      out.write("\t            <li class=\"about\"><a onclick=\"return redirect('Delete an Item')\" href=\"#\">Delete An Item</a></li>\n");
      out.write("\t            <li class=\"services\"><a onclick=\"return redirect('Recharge')\" href=\"#\">Recharge</a></li>\n");
      out.write("\t            <li class=\"portfolio\"><a onclick=\"return redirect('Add new Customer')\" href=\"#\">Add new Customer</a></li>\n");
      out.write("\t            <li class=\"contact\"><a onclick=\"return redirect('Delete customer')\" href=\"#\">Delete customer</a></li>\n");
      out.write("\t            <li class=\"home\"><a onclick=\"return redirect('Feedback')\" href=\"#\">Feedback</a></li>\n");
      out.write("\t        </ul>\n");
      out.write("\t\t</div> <!-- /.navigation -->\n");
      out.write("\n");
      out.write("\t</div> <!-- /#main-sidebar -->\n");
      out.write("\n");
      out.write("\t<div id=\"main-content\">\n");
      out.write("\n");
      out.write("\t\t<div id=\"templatemo\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t<div class=\"welcome-text\">\n");
      out.write("\t\t\t\t\t\t\t<h2>Recharge Customer's balance amount...</h2>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div> <!-- /#sTop -->\n");
      out.write("\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div >\n");
      out.write("\t\t<div class=\"message\">\n");
      out.write("\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</h3>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<div id=\"bg\">\n");
      out.write("  <div class=\"module\">\n");
      out.write("   \n");
      out.write("  <form action=\"recharge\">\n");
      out.write("      <input class=\"textbox\" placeholder=\"Account Number\" name=\"account_number\" type=\"text\" required=\"required\"/><br><Br>\n");
      out.write("\t\t<input class=\"textbox\" placeholder=\"Amount\" name=\"balance\" type=\"number\" min=\"1\" required=\"required\" /> <br>\n");
      out.write("\t\t<input class=\"button\" type=\"submit\" value=\"Recharge\" /> \n");
      out.write("\t\t<input class=\"button\" type=\"reset\" value=\"Reset\" />\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("\t\t</div> <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div> <!-- /#main-content -->\n");
      out.write("\n");
      out.write("\t<!-- JavaScripts -->\n");
      out.write("\t<script src=\"js/jquery-1.10.2.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.singlePageNav.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.prettyPhoto.js\"></script>\n");
      out.write("\t<script src=\"js/custom.js\"></script>\n");
      out.write("\n");
      out.write("\t<script>\n");
      out.write("\t\t$(document).ready(function(){\n");
      out.write("\t\t\t$(\"a[data-gal^='prettyPhoto']\").prettyPhoto({hook: 'data-gal'});\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("        function initialize() {\n");
      out.write("          var mapOptions = {\n");
      out.write("            zoom: 13,\n");
      out.write("            center: new google.maps.LatLng(40.7809919,-73.9665273)\n");
      out.write("          };\n");
      out.write("\n");
      out.write("          var map = new google.maps.Map(document.getElementById('map-canvas'),\n");
      out.write("              mapOptions);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function loadScript() {\n");
      out.write("          var script = document.createElement('script');\n");
      out.write("          script.type = 'text/javascript';\n");
      out.write("          script.src = 'https://maps.googleapis.com/maps/api/js?v=3.exp&sensor=false&' +\n");
      out.write("              'callback=initialize';\n");
      out.write("          document.body.appendChild(script);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        window.onload = loadScript;\n");
      out.write("    </script>\n");
      out.write("<!-- templatemo 394 sonic -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
