/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2023-05-30 20:21:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.JSP;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import in.co.rays.proj4.controller.MyProfileCtl;
import in.co.rays.proj4.util.HTMLUtility;
import java.util.HashMap;
import in.co.rays.proj4.util.DataUtility;
import in.co.rays.proj4.util.ServletUtility;
import in.co.rays.proj4.controller.ORSView;
import in.co.rays.proj4.controller.LoginCtl;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.controller.ORSView;
import in.co.rays.proj4.bean.RoleBean;
import in.co.rays.proj4.controller.LoginCtl;
import in.co.rays.proj4.bean.UserBean;
import in.co.rays.proj4.controller.ORSView;

public final class MyProfileView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/JSP/Header.jsp", Long.valueOf(1684272079464L));
    _jspx_dependants.put("/JSP/Footer.jsp", Long.valueOf(1684271678845L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.rays.proj4.controller.ORSView");
    _jspx_imports_classes.add("in.co.rays.proj4.controller.LoginCtl");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.UserBean");
    _jspx_imports_classes.add("in.co.rays.proj4.util.DataUtility");
    _jspx_imports_classes.add("in.co.rays.proj4.util.HTMLUtility");
    _jspx_imports_classes.add("in.co.rays.proj4.util.ServletUtility");
    _jspx_imports_classes.add("java.util.HashMap");
    _jspx_imports_classes.add("in.co.rays.proj4.controller.MyProfileCtl");
    _jspx_imports_classes.add("in.co.rays.proj4.bean.RoleBean");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/resources/demos/style.css\">\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("  <script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("  $( function() {\r\n");
      out.write("    $( \"#date\" ).datepicker({\r\n");
      out.write("      changeMonth: true,\r\n");
      out.write("      changeYear: true,\r\n");
      out.write("\t  yearRange:'1980:2020',\r\n");
      out.write("\t  dateFormat:'dd-mm-yy'\r\n");
      out.write("    });\r\n");
      out.write("  } );\r\n");
      out.write("  </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("        ");
      in.co.rays.proj4.bean.UserBean bean = null;
      bean = (in.co.rays.proj4.bean.UserBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.rays.proj4.bean.UserBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("<form action=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Project4</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"margin: 0\">\r\n");
      out.write("\r\n");
      out.write("\t");

		UserBean userBean = (UserBean) session.getAttribute("user");

		boolean userLoggedIn = userBean != null;

		String welcomeMsg = "Hi, ";

		if (userLoggedIn) {
			String role = (String) session.getAttribute("role");
			welcomeMsg += userBean.getFirstName() + " (" + role + ")";    
		} else {
			welcomeMsg += "Guest";
		}
	
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\t<table style=\"width: 100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td><b><a href=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\">Welcome</a> </b>| ");

 	if (userLoggedIn) {
 
      out.write("<b><a\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\">Logout</a></b>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write(" <b><a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\">Login</a></b> ");

 	}
 
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<td rowspan=\"2\">\r\n");
      out.write("\t\t\t\t<h1 align=\"right\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" width=\"250\"\r\n");
      out.write("\t\t\t\t\t\theight=\"75\">\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<h3>\r\n");
      out.write("\t\t\t\t\t");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");

			if (userLoggedIn) {
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\"><font style=\"font-size: 17px\"> <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">MyProfile</a></b>| <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change Password</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get Marksheet</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet\r\n");
      out.write("\t\t\t\t\t\t\tMeritList</a></b> | ");

 	if (userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write(" <b><a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a></b> |<b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a></b> |<b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</a></b> |<b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a></b> |<b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</a></b> |<br> <b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</a>\r\n");
      out.write("\t\t\t\t</b> |<b> <a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable\r\n");
      out.write("\t\t\t\t\t\t\tList</a></b> |<b> <a target=\"blank\" href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\">Java\r\n");
      out.write("\t\t\t\t\t\t\tDoc</a>\r\n");
      out.write("\t\t\t\t</b> | ");

					}
				
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.STUDENT) {
 
      out.write(" <b><a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a>\r\n");
      out.write("\t\t\t\t</b> |<b> <a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</a>\r\n");
      out.write("\t\t\t\t</b> | ");

					}
				
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.KIOSK) {
 
      out.write(" <b><a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</a>\r\n");
      out.write("\t\t\t\t</b> |<b> <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a>\r\n");
      out.write("\t\t\t\t</b>| ");

					}
				
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.FACULTY) {
 			// System.out.println("======>><><>"+userBean.getRoleId());
 
      out.write(" <b><a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a>\r\n");
      out.write("\t\t\t\t</b> |<b> <a href=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a></b> |\r\n");
      out.write("\t\t\t\t\t<b><a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a></b> | <b> <a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add TimeTable</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</a></b> | ");

 	}
 
      out.write(' ');

 	if (userBean.getRoleId() == RoleBean.COLLEGE_SCHOOL) {
 
      out.write(" <b><a href=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a></b> | <b><a\r\n");
      out.write("\t\t\t\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a>\r\n");
      out.write("\t\t\t\t</b> | <b><a href=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a></b> |\r\n");
      out.write("\t\t\t\t\t<b><a href=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a></b> |<b>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">TimeTable List</a>\r\n");
      out.write("\t\t\t\t</b> |<b> <a href=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a></b> | ");

 	}
 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t</font></td>\r\n");
      out.write("\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t");

			}
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"3\"><hr></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<center>\r\n");
      out.write("         \r\n");
      out.write("            \r\n");
      out.write("            <input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\r\n");
      out.write("            <input type=\"hidden\" name=\"createdBy\" value=\"");
      out.print(bean.getCreatedBy());
      out.write("\">\r\n");
      out.write("            <input type=\"hidden\" name=\"modifiedBy\" value=\"");
      out.print(bean.getModifiedBy());
      out.write("\"> \r\n");
      out.write("            <input type=\"hidden\" name=\"createdDatetime\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getCreatedDatetime()));
      out.write("\">\r\n");
      out.write("            <input type=\"hidden\" name=\"modifiedDatetime\" value=\"");
      out.print(DataUtility.getTimestamp(bean.getModifiedDatetime()));
      out.write("\">\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("     <div align=\"center\">\r\n");
      out.write("                <h1>My Profile</h1>\r\n");
      out.write("            <H2><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("</font></H2>\r\n");
      out.write("            <H2><font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("</font></H2>\r\n");
      out.write("     </div>\r\n");
      out.write("          <!--   <table style=\"font-size: 20px\"> -->\r\n");
      out.write("            <table>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th align=\"left\">LoginId <span style=\"color: red\">*</span> :</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"login\" readonly=\"readonly\" style=\"width: 170px\" value=\"");
      out.print(DataUtility.getStringData(bean.getLogin()));
      out.write("\"readonly=\"readonly\"></td>          \r\n");
      out.write("                   <td style=\"position: fixed\"> <font  color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("login", request));
      out.write("</font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\t\r\n");
      out.write("\t<tr><th style=\"padding: 3px\"></th></tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th align=\"left\">First Name <span style=\"color: red\">*</span> :</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"firstName\" style=\"width: 170px\"  value=\"");
      out.print(DataUtility.getStringData(bean.getFirstName()));
      out.write("\">\r\n");
      out.write("                   </td><td style=\"position: fixed\"> <font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("firstName", request));
      out.write("</font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("    \r\n");
      out.write("    <tr><th style=\"padding: 3px\"></th></tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th align=\"left\">Last Name <span style=\"color: red\">*</span> :</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"lastName\" style=\"width: 170px\"  value=\"");
      out.print(DataUtility.getStringData(bean.getLastName()));
      out.write("\">\r\n");
      out.write("                   </td><td style=\"position: fixed\"> <font  color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("lastName", request));
      out.write("</font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("   <tr><th style=\"padding: 3px\"></th></tr>             \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th align=\"left\">Gender <span style=\"color: red\">*</span> :</th>\r\n");
      out.write("                    <td>\r\n");
      out.write("                        ");

                            HashMap map = new HashMap();
                            map.put("Male", "Male");
                            map.put("Female", "Female");
                            
                        
      out.write(' ');
      out.print(HTMLUtility.getList("gender", bean.getGender(),map));
      out.write("\r\n");
      out.write("                    </td>\r\n");
      out.write("                    <td style=\"position: fixed\"> <font  color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("gender", request));
      out.write("</font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("    <tr><th style=\"padding: 3px\"></th></tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th align=\"left\">Mobile No <span style=\"color: red\">*</span> :</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"mobileNo\" style=\"width: 170px\" maxlength=\"10\" value=\"");
      out.print(DataUtility.getStringData(bean.getMobileNo()));
      out.write("\"></td>\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed\"><font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("mobileNo", request));
      out.write("</font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("<tr><th style=\"padding: 3px\"></th></tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th align=\"left\">Date Of Birth <span style=\"color: red\">*</span> :</th>\r\n");
      out.write("                    <td><input type=\"text\" name=\"dob\" id=\"date\" style=\"width: 170px\" value=\"");
      out.print(DataUtility.getDateString(bean.getDob()));
      out.write("\">\r\n");
      out.write("                    \r\n");
      out.write("                    </td><td><font style=\"position: fixed\"  color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage("dob", request));
      out.write("</font></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("   <tr><th style=\"padding: 3px\"></th></tr>\t\r\n");
      out.write("                <tr> <th></th><td colspan=\"2\">\r\n");
      out.write("                    \r\n");
      out.write("                    <input type=\"submit\" name=\"operation\" value=\"");
      out.print(MyProfileCtl.OP_SAVE );
      out.write("\"> \r\n");
      out.write("                   \r\n");
      out.write("                    <input type=\"submit\" name=\"operation\" value=\"");
      out.print(MyProfileCtl.OP_CHANGE_MY_PASSWORD );
      out.write("\"> \r\n");
      out.write("                    \r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("     \r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    </center>\r\n");
      out.write(" \r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".footer {\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\tleft: 0;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 55px;\r\n");
      out.write("\t\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Footer</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"footer\">\r\n");
      out.write("<HR>\r\n");
      out.write("\t\t<CENTER>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<H3>&copy; Copyrights RAYS Technologies</H3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</CENTER>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
