<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Main Page</title>
</head>
<body>
<h1>Welcome to Pets Section</h1>
<form name="Dogform" method="get" action="Dog">
	<div>
	<h2>Want to Add a Dog</h2>
	    <label for="name"><b>Name</b></label>
	    <input type="text" placeholder="Enter Name" name="dname" required>
		<br>
	    <label for="breed"><b>Breed</b></label>
	    <input type="text" placeholder="Enter Breed" name="dbreed" required>
	    <br>
	    <label for="weight"><b>Weight</b></label>
	    <input type="number" placeholder="Enter Weight" name="dweight" required>
		<br>
	    <button type="submit">Add Dog</button>
	    
	 </div>
 </form>
 <form name="Catform" method="post" action="Cat">
	 <div>
	 <h2>Want to Add a Cat</h2>
	    <label for="name"><b>Name</b></label>
	    <input type="text" placeholder="Enter Name" name="cname" required>
	    <br>
		<label for="breed"><b>Breed</b></label>
	    <input type="text" placeholder="Enter Breed" name="cbreed" required>
		<br>
	    <label for="weight"><b>Weight</b></label>
	    <input type="number" placeholder="Enter Weight" name="cweight" required>
		<br>
	    <button type="submit">Add Cat</button>
	    
	 </div>
 </form>
</body>
</html>