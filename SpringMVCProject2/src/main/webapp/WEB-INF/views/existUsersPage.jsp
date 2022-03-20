<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.model.Data"
	import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Existing User</h3>
	<table>
		<c:forEach items="${Users}" var="d">
			<tr>
				<td><c:out value="${d.userFname }"></c:out></td>
				<td><c:out value="${d.userLname }"></c:out></td>
				<td><c:out value="${d.email }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addUser">Add another user</a>
</body>
</html>