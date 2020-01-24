<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Vehicle Details</title>
</head>
<body>
	<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<h2>Edit Details</h2>

	<form:form action="/app/updateCarProcess" method="POST" modelAttribute="carCatalogue"  acceptCharset="UTF-8">
		<input type="hidden" name="id" value="${carCatalogue.carId}" />

		<table>
			<tr>
				<td>carId</td>
				<td><form:input type="text" path="carId"
						value="${carCatalogue.carId}" size="30" readOnly="true" /></td>
			</tr>

			<tr>
				<td>Type</td>
				<td><form:input path="type" size="30"
						value="${carCatalogue.type}" required="required" /> <font
					color="red"><form:errors path="type" /></font></td>
			</tr>


			<tr>
				<td>Make:</td>
				<td><form:input path="make" size="30"
						value="${carCatalogue.make}" required="required" /> <font
					color="red"><form:errors path="color" /></td>
			</tr>

			<tr>
				<td>Model:</td>
				<td><form:input path="model" size="30"
						value="${carCatalogue.model}" required="required" /><font
					color="red"><form:errors path="model" /></td>
			</tr>

			<tr>
				<td>Year:</td>
				<td><form:input path="year" size="30"
						value="${carCatalogue.year}" required="required" /><font
					color="red"><form:errors path="year" /></td>
			</tr>

			<tr>
				<td>Color:</td>
				<td><form:input path="color" size="30"
						value="${carCatalogue.color}" required="required" /> <font
					color="red"><form:errors path="color" /></td>
			</tr>

			<tr>
				<td>LicenseNum:</td>
				<td><form:input path="licenceNum" size="30"
						value="${carCatalogue.licenceNum}" required="required" /> <font
					color="red"><form:errors path="licenceNum" /></td>
			</tr>
			
			<tr>
				<td>Status:</td>
				<td><form:input path="status" size="30"
						value="${carCatalogue.status}" required="required" /> <font
					color="red"><form:errors path="status" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>