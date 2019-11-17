<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		
<h2 align=center>Client Record</h2>
		<table align=center>
		<tr><td>ClientDL</td><td>expDate</td><td>phoneNumber</td><td>firstName</td><td>lastName</td></tr>
		<tr>
		<td>${ client.clientId }</td>
		<td>${ client.clientDL }</td>
		<td>${client.expDate}</td>
		<td>${client.phoneNumber}</td>
		<td>${client.firstName}</td>
		<td>${client.lastName}</td>
		</tr>
		
		
		</table>
		
</body>
</html>