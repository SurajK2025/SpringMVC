<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Existing User</h3>
	<table>
		<tr><td><%= request.getParameter("fname")%></td></tr>
		<tr><td><%= request.getParameter("lname")%></td></tr>
		<tr><td><%= request.getParameter("email")%></td></tr>
	</table>
</body>
</html>