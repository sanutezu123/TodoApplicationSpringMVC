/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-04-16 19:44:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Task Manager</title>\n");
      out.write("\t<link href = \"webjars/bootstrap/4.4.1-1/css/bootstrap.min.css\" rel = \"stylesheet\">\n");
      out.write("\t<link href = \"resources/css/main.css\" rel = \"stylesheet\">\n");
      out.write("\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"sidenav\">\n");
      out.write("         <div class=\"login-main-text\">\n");
      out.write("            <h2>Task Manager<br> Login Page</h2>\n");
      out.write("            <p>Login or register from here to access.</p>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"main\">\n");
      out.write("         <div class=\"col-md-6 col-sm-12\">\n");
      out.write("            <div class=\"login-form\">\n");
      out.write("               <form action = \"/login\" method = \"POST\">\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                     <label>User Name</label>\n");
      out.write("                     <input type=\"text\" name = \"name\" class=\"form-control\" placeholder=\"User Name\">\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-group\">\n");
      out.write("                     <label>Password</label>\n");
      out.write("                     <input type=\"password\" name = \"password\" class=\"form-control\" placeholder=\"Password\">\n");
      out.write("                  </div>\n");
      out.write("                  <button type=\"submit\" class=\"btn btn-black\">Login</button>\n");
      out.write("               </form>\n");
      out.write("               <a href = \"/register\">New User Register here</a>\n");
      out.write("            </div>\n");
      out.write("            <p style = \"color:red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${errorMessage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("            <p style = \"color:green\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${message}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("         </div>\n");
      out.write("      </div>\n");
      out.write("\t<script type=\"webjars/jquery/3.3.1/jquery.js\"></script>\n");
      out.write("\t<script type=\"webjars/bootstrap/4.4.1-1/js/bootstrap.min.js\"></script>\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
