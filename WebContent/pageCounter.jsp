<%@ page import="com.example.web.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
	int count=1;
	int doubleCount(){
		count = count * 2;
		return count;
	}
%>
The Page Count Now is :
<%
	out.println(Counter.getCount());
%>
<br>
The Page Count Now is :
<%= Counter.getCount() %><br>

The Page Count *2 Now is :
<%= doubleCount() %>

</body>
</html>