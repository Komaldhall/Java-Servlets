<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Great Number Game</title>
</head>
<body>
	<h2>Welcome to Great Number Game!</h2>
	
	<form name="Numform" method="post" action="Home">
		
		<p>I am thinking of a number between the mentioned range.</p>
		<p>Take a guess!</p>
		<% if (session.getAttribute("rock")=="") {%>
			<input type="number" placeholder="Enter Number" name="num" required>
			<button>Submit</button>	
		<%} %>
	</form>	
	<br>
	<form name="Numberform" method="get" action="Home">
		<c:out value="${result}"/>
		<c:out value="${randomNumber}"/>
		
		<% if (session.getAttribute("rock")!="") {%>
		<br><br>
			<% session.setAttribute("rock","");%>
			<button>Play Again!!</button>	
		<%} %>
	</form>
	
</body>
</html>