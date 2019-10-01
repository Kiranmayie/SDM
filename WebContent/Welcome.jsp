<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>CAR RENTAL BOOKING MANAGEMENT SYSTEM</title>
<link rel="stylesheet" href="../css/style.css" type="text/css"></link>
<<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <style>
        .form-group label {width: 40%;}
        .form-horizontal {width: 50%; margin: 20px auto; text-align: center; border: 1px solid #ccc; border-radius: 30px; padding: 20px 0;}
        .form-group .form-control {width: 40%; display: inline-block;}
        p {color:red; font-size:200%;}
        h1 {color:green;}
        h2 {color:white;}
        label {color:orange;}
        body {text-align: center; background-image: url("background.jpg");}
    </style>
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