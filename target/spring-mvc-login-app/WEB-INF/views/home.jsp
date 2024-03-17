<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Login Page</h1>
 

	<form action="validateUser" method="post">
		<input type="text" name="userName"><br> 
		<input type="password" name="password"><br>
		<input type="submit" value="Login">
	</form>
	
	${message}
</body>
</html>