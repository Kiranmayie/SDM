<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<font color="blue">CAR RENTAL BOOKING MANAGEMENT SYSTEM </font><br><br>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>CAR RENTAL BOOKING MANAGEMENT SYSTEM</title>
<link rel="stylesheet" href="../css/style.css" type="text/css"></link>
<script language="JavaScript" type="text/JavaScript" 
src="../script/validate.js"></script>
</head>
<body>

<div class="bgimg">
  <div class="topleft">
    <p>WELCOME</p>
  </div>
  <div class="middle">
    <h1>CAR RENTAL BOOKING MANAGEMENT SYSTEM</h1>
    <hr>
   <marquee behavior="scroll" direction="left">HOME PAGE</marquee>
  </div>
  <div class="bottomleft">
    
    <a href="C:/Users/USER/git/SOEN-6471/6471TicketBooking/WebContent/AdminLogin.jsp">ADMIN LOGIN</a>
  </div>
</div>
<table>
  <form action="ClerkLoginServlet" method="post">
  
  <tr><td><div style="color: #FF0000;"> <span class="error">${message}</span></div><br></td></tr>
  <tr><td><label>Clerk Name</label></td>
  <td><input type="text"  name="name" /></td></tr>
  <tr><td><label>Email Address</label></td>
  <td><input type="email" name="email" /></td></tr>
 <tr><td><input type="submit" value="Login"></td></tr>
 
 </form>
 </table>

</body>
</html>