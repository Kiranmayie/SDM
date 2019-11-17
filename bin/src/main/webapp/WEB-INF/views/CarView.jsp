<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		
<h2 align=center>Car Record</h2>
		<table align=center>
		<tr><td>CarID</td><td>type</td><td>make</td><td>model</td><td>year</td><td>color</td><td>licenceNum</td><td>Status</td></tr>
		<tr>
		<td>${CarCatalogue.CarID}</td>
		<td>${carCatalogue.type}</td>
		<td>${carCatalogue.make}</td>
		
		</tr>
		
		
		</table>
		
</body>
</html>