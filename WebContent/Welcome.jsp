<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>CAR RENTAL BOOKING MANAGEMENT SYSTEM</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
 

<script language="JavaScript" type="text/JavaScript" 
src="../script/validate.js"></script>
</head>
<body>
<div class="sidenav">
         <div class="login-main-text">
            <h2>Car Rental Booking<br> Management System</h2>
            <p>Clerk Login from here to access.</p>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
    
    
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