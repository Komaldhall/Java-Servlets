<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>CheckerBoard</title>
	<link href="index.css" rel="stylesheet" type="text/css"/>
	
</head>
<body>
 	<%int width = Integer.parseInt(request.getParameter("width")); %>
	<%int height = Integer.parseInt(request.getParameter("height"));%>
	<table>
	<%for(int r=0; r<height; r++) { %>
	<tr>
		<% for (int c=0; c<width; c++) { %>
			<% if(c%2==r%2) { %>
				<td class="red"></td>
			<%} else {%>
				<td class="black"></td>
			<%} %>
		<%} %>
	</tr>
	<%} %>	
	</table>
</body>
</html>