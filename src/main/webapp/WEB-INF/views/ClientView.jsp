<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">

	<th>ClientDL</th>
	<th>ExpiryDate</th>
	<th>PhoneNumber</th>
	<th>FirstName</th>
	<th>LastName</th>
	

<tr>
		<td>${ client.clientId }</td>
		<td>${ client.clientDL }</td>
		<td>${client.expDate}</td>
		<td>${client.phoneNumber}</td>
		<td>${client.firstName}</td>
		<td>${client.lastName}</td>
		
<c:forEach var="carItem" items="${list}">
<tr>
<td><c:out value="${carItem.clientId}"></c:out></td>
<td><c:out value="${carItem.clientDL}"></c:out></td>
<td><c:out value="${carItem.expDate}"></c:out></td>
<td><c:out value="${carItem.phoneNumber}"></c:out></td>
<td><c:out value="${carItem.firstName}"></c:out></td>
<td><c:out value="${carItem.lastName}"></c:out></td>

</tr>
</c:forEach>
<%-- <td>${carCatalogue.Status}</td> --%>
</tr>
		
		</table>
		
</body>
</html>