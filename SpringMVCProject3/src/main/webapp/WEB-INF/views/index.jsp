<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:if test="${!msg.isEmpty()}">
		<h2><c:out value="${msg }"></c:out> </h2>
	</c:if>
	<a href="addUser">Add Users</a><br>	
	<a href="exstUser">Existing Users</a>	
</body>
</html>