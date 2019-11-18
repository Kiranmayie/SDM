<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Records</title>
</head>
<body>
<table border="1">

		<th>CarID</th>
		<th>Type</th>
		<th>Make</th>
		<th>Model</th>
		<th>Year</th>
		<th>Color</th>
		<th>LisenceNumber</th>
		<th>Status</th>
		


		
	  <tr>
<td>${id}</td>
<td>${carCatalogue.carID}</td>
<td>${carCatalogue.type}</td>
<td>${carCatalogue.make}</td>
<td>${carCatalogue.model}</td>
<td>${carCatalogue.year}</td>
<td>${carCatalogue.color}</td>
<td>${carCatalogue.licenceNum}</td>
<td>${status}</td>
<c:forEach var="carItem" items="${list}">
<tr>
<td><c:out value="${carItem.carID}"></c:out></td>
<td><c:out value="${carItem.type}"></c:out></td>
<td><c:out value="${carItem.make}"></c:out></td>
<td><c:out value="${carItem.model}"></c:out></td>
<td><c:out value="${carItem.year}"></c:out></td>
<td><c:out value="${carItem.color}"></c:out></td>
<td><c:out value="${carItem.licenceNum}"></c:out></td>
<td><c:out value="${carItem.status}"></c:out></td>
</tr>
</c:forEach>
<%-- <td>${carCatalogue.Status}</td> --%>
</tr>


</table>
		
		
</body>
</html>