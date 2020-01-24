<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client Details</title>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<h2>Edit Details</h2>

	<form:form action="/app/updateClientProcess" method="POST" modelAttribute="client"  acceptCharset="UTF-8">
		<input type="hidden" name="id" value="${client.clientDL}" />

		<table>
			<tr>
				<td>clientDL</td>
				<td><form:input type="text" path="clientDL"
						value="${client.clientDL}"/></td>
			</tr>

			<tr>
				<td>expDate</td>
				<td><form:input path="expDate" size="30"
						value="${client.expDate}" required="required" /> <font
					color="red"><form:errors path="expDate" /></font></td>
			</tr>


			<tr>
				<td>phoneNumber:</td>
				<td><form:input path="phoneNumber" size="30"
						value="${client.phoneNumber}" required="required" /> <font
					color="red"><form:errors path="phoneNumber" /></td>
			</tr>

			<tr>
				<td>firstName:</td>
				<td><form:input path="firstName" size="30"
						value="${client.firstName}" required="required" /><font
					color="red"><form:errors path="firstName" /></td>
			</tr>

			<tr>
				<td>lastName:</td>
				<td><form:input path="lastName" size="30"
						value="${client.lastName}" required="required" /><font
					color="red"><form:errors path="lastName" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>