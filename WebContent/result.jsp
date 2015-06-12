<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Beer Recommand Page</h1>
	<p>
		<%
			List<String> styles = (List<String>) request.getAttribute("styles");
			Iterator<String> iter = styles.iterator();
			while (iter.hasNext()) {
				out.print("<br>You May Like :" + iter.next());
			}
			
			out.print("<br>Admin email: " + request.getAttribute("adminEmail"));
		%>
	
</body>
</html>