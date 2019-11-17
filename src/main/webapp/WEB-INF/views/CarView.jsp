x`<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>
<body>



	<h2 align=center>Car Record</h2>
	<table align=center>
		<tr>
			<td>CarID</td>
			<td>type</td>
			<td>make</td>
			<td>model</td>
			<td>year</td>
			<td>color</td>
			<td>licenceNum</td>
			<td>Status</td>
		</tr>
		<tr>
			<td>${id}</td>
			<%-- 		<td>${carCatalogue.CarID}</td> --%>
			<td>${carCatalogue.type}</td>
			<td>${carCatalogue.make}</td>
			<td>${carCatalogue.model}</td>
			<td>${carCatalogue.year}</td>
			<td>${carCatalogue.color}</td>
			<td>${carCatalogue.licenceNum}</td>
			<td>${status}</td>

			<c:forEach var="carItem" items="${list}">
				<tr>
					<td><c:out value="${carItem.carId}"></c:out></td>
 					<td><c:out value="${carItem.type}"></c:out></td>
					<td><c:out value="${carItem.make}"></c:out></td>
					<td><c:out value="${carItem.year}"></c:out></td>
					<td><c:out value="${carItem.color}"></c:out></td>
					<td><c:out value="${carItem.licenceNum}"></c:out></td>
					<td><c:out value="${carItem.status}"></c:out></td> 

				</tr>
			</c:forEach>

			<%-- 		<td>${carCatalogue.Status}</td> --%>

		</tr>


	</table>

</body>
</html>