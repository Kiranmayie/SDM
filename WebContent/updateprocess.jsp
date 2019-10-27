<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/test";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String id = request.getParameter("clientId");
String Client_DL=request.getParameter("clientDL");
String expDate=request.getParameter("expDate");
String phoneNumber=request.getParameter("phoneNumber");
String firstName=request.getParameter("firstName");
String lastName=request.getParameter("lastName");
if(id != null)
{
Connection con = null;
PreparedStatement ps = null;
int personID = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="Update users set clientId=?,clientDL=?,expDate=?,phoneNumber=?,firstName=?,lastName=? where id="+id;
ps = con.prepareStatement(sql);
ps.setString(1,id);
ps.setString(2, Client_DL);
ps.setString(3, expDate);
ps.setString(4, phoneNumber);
ps.setString(5, firstName);
ps.setString(6,lastName);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>