<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Button Clicker</title>
</head>
<body>
	<h1>Click the button!</h1>
	<form action="Home" method="get">
		<input type="submit" value="Click me!">
		<p>You clicked me 
		<c:out value="${clickCount}" />
		times</p>
	</form>
	
</body>
</html>