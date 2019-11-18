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
<table border="1">

	<th>ClientDL</th>
	<th>ExpiryDate</th>
	<th>PhoneNumber</th>
	<th>FirstName</th>
	<th>LastName</th>
	

<tr>
	
	
		
<c:forEach var="clientItem" items="${list1}">
<tr>

<td><c:out value="${clientItem.clientDL}"></c:out></td>
<td><c:out value="${clientItem.expDate}"></c:out></td>
<td><c:out value="${clientItem.phoneNum}"></c:out></td>
<td><c:out value="${clientItem.firstName}"></c:out></td>
<td><c:out value="${clientItem.lastName}"></c:out></td>

</tr>
</c:forEach>
<%-- <td>${carCatalogue.Status}</td> --%>
</tr>
		
		</table>
		
</body>
</html>