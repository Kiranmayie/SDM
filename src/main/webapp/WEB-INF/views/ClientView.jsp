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


<h3>Welcome User- ${useradded}</h3>
<h1><a href="addClient/${useradded}">Add Client</a></h1>
<br>
<br>
<br>
<table border="1">

		
		<th>clientDL</th>
		<th>expDate</th>
		<th>phoneNumber</th>
		<th>firstName</th>
		<th>lastName</th>
		
		


		
	  <tr>

<c:forEach var="clientItem" items="${list1}">
<tr>

<td><c:out value="${clientItem.clientDL}"></c:out></td>
<td><c:out value="${clientItem.expDate}"></c:out></td>
<td><c:out value="${clientItem.phoneNumber}"></c:out></td>
<td><c:out value="${clientItem.firstName}"></c:out></td>
<td><c:out value="${clientItem.lastName}"></c:out></td>
<td><a href="updateclient/${useradded}/${clientItem.clientDL}">Update</a></td>

					<td><a href="Deleteclient/${useradded}/${clientItem.clientDL}">Delete</a>
</tr>
</c:forEach>

</tr>


</table>
		
		
</body>
</html>