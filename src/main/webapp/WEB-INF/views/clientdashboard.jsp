<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
  </head>
  <body>
    
    <h4><a href="<c:url value="/system/catalog"/>">View Catalog</a></h4>
    
    <h4><a href="<c:url value="/client/dashboard"/>">Client Management System</a></h4>
    <h4><a href="<c:url value="/system/catalog?from=reserve"/>">Reserve/Rental </a></h4>
    <h4><a href="<c:url value="/cancelReturn/transactionSearch"/>">Cancel/Return</a></h4>
      </body>
      <a href="${contextpath }/root/">Logout</a>
</html>