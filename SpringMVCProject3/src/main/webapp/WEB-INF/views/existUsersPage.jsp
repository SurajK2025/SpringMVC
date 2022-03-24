<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.entities.Todo"
	import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
	table, td { border: 2px solid rgb(0, 0, 0); 
            border-collapse: collapse;}
    td { padding: 5px; text-align: left;}
</style>
</head>
<body>
	<h3>Existing User</h3>
	<table>
		<c:forEach items="${Users}" var="d">
			<tr>
				<td><c:out value="${d.todoTitle }"></c:out></td>
				<td><c:out value="${d.todoContent }"></c:out></td>
				<td><c:out value="${d.todoDate }"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<a href="addUser">Add another user</a>
</body>
</html>