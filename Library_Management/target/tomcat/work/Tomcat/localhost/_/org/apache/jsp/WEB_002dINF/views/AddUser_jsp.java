/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-03-22 07:17:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>library management</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<!-- Sidebar -->\r\n");
      out.write("\t<div class=\"w3-sidebar w3-light-grey w3-bar-block\" style=\"width: 20%\">\r\n");
      out.write("\t\t<h3 class=\"w3-bar-item\">Menu</h3>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"/AddBook\" class=\"w3-bar-item w3-button\">Add book</a> \r\n");
      out.write("\t\t<a href=\"/Search\"\r\n");
      out.write("\t\t\tclass=\"w3-bar-item w3-button\">Search book</a> \r\n");
      out.write("\t\t\t<a href=\"/AddUser\" class=\"w3-bar-item w3-button\">add user</a>\r\n");
      out.write("\t\t\t<a href=\"/Search\"\r\n");
      out.write("\t\t\tclass=\"w3-bar-item w3-button\">Search book</a>\r\n");
      out.write("\t\t\t<a href=\"#\"\r\n");
      out.write("\t\t\tclass=\"w3-bar-item w3-button\">Issue book</a> \r\n");
      out.write("\t\t\t<a href=\"#\"\r\n");
      out.write("\t\t\tclass=\"w3-bar-item w3-button\">Return book</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div style=\"margin-left: 20%\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"w3-container w3-teal\">\r\n");
      out.write("\t\t\t<h1>Library management system </h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"w3-container\">\r\n");
      out.write("\t\t\t<h2>Library add user</h2>\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t<form action=\"/AddUser\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t<br> <br>\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Name</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"Name\"><br></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>Address:</td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"text\" name=\"Address\"><br></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t\t\t<td><input type=\"submit\" value=\"add new user\"></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
