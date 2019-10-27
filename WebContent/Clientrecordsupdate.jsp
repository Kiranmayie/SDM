<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("clientId");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/carrental?autoReconnect=true&useSSL=false";
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
<%
try{
	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental?autoReconnect=true&useSSL=false", "root", "Kiran@28");
statement=connection.createStatement();
String sql ="select * from tblClient where clientId="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

<html>
<body>
<h1>Update data from database in jsp</h1>
<form method="post" action="updateprocess.jsp">
<input type="hidden" name="id" value="<%=resultSet.getString("clientId") %>">
<input type="text" name="id" value="<%=resultSet.getString("clientId") %>">
<br>
ClientDL<br>
<input type="text" name="Client_DL" value="<%=resultSet.getString("Client_DL") %>">
<br>
Expiration Date<br>
<input type="text" name="expDate" value="<%=resultSet.getString("expDate") %>">
<br>
Phone number<br>
<input type="text" name="phoneNumber" value="<%=resultSet.getString("phoneNumber") %>">
<br>
First Name<br>
<input type="text" name="firstName" value="<%=resultSet.getString("firstName") %>">
<br><br>
Last Name<br>
<input type="text" name="LastName" value="<%=resultSet.getString("LastName") %>">
<br><br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>
