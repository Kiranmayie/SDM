	<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("id");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/carrental";
String database = "carrental";
String userid = "root";
String password = "Kiran@28";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html>
<body>
<h1>Manage Client Records</h1>
<table border="1">
<tr>
<td>id</td>
<td>License Number</td>
<td>Expiration Date</td>
<td>Phone Number</td>
<td>FirstName</td>
<td>LastName</td>
<td>Update</td>
</tr>
<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental", "root", "Kiran@28");
statement=connection.createStatement();
String sql ="select * from tblClient";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><%=resultSet.getString("clientId") %></td>
<td><%=resultSet.getString("clientDL") %></td>
<td><%=resultSet.getString("expDate") %></td>
<td><%=resultSet.getString("phoneNumber") %></td>
<td><%=resultSet.getString("firstName") %></td>
<td><%=resultSet.getString("lastName") %></td>
<td><a href="Clientrecordsupdate.jsp?ClientId=<%=resultSet.getString("clientId")%>">Update</a></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>
