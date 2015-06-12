<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Test Add Init parameter to JSP and overwrite jspInit() method !</h1><br>
<%!
	public void jspInit(){
		ServletConfig config = getServletConfig();
		String email = config.getInitParameter("email");
		ServletContext ctx = getServletContext();
		ctx.setAttribute("mail", email);
	}
%>
<br>
But offen we use application,request,session,pageContext this 4 hiddle object!!!!
</body>
</html>