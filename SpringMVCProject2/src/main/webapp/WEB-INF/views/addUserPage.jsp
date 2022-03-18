<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add User</h3>
	<form method="post" action="existUsers">
		<input type="text" name="fname" placeholder="Fname"><br>
		<input type="text" name="lname" placeholder="Lname"><br>
		<input type="text" name="email" placeholder="Email">
		<input type="submit" value="Submit">
	</form>
</body>
</html>