<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- 
<jsp:useBean id="person1" type="com.example.bean.Person" class="com.example.bean.Employee">
<jsp:setProperty name="person1" property="name" value="<%=request.getParameter("userName") %>"/>
</jsp:useBean>
--%>

	<jsp:useBean id="person" type="com.example.bean.Employee"
		class="com.example.bean.Employee">
		<jsp:setProperty name="person" property="*"/>
	</jsp:useBean>

	UserName :
	<jsp:getProperty name="person" property="name" />
	EmployeeID:
	<jsp:getProperty property="empID" name="person"/>

</body>
</html>