<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">Search Page</h2>

<center>
<form action="carCatalogueSearch">
<input type= "text" name="id">
<input type= "submit" value= "search">
</form>
</center>

<form action="client">
<input type="text" name="lastName">
<input type="submit" value="search">

</body>
</html>