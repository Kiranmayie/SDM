<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<script language="JavaScript" type="text/JavaScript" 
src="../script/validate.js"></script>
</head>
<body>
<div class="sidenav">
         <div class="login-main-text">
            <h2>Car Rental Booking<br> Management System</h2>
            <p>Admin Login from here to access.</p>
         </div>
      </div>
      <div class="main">
         <div class="col-md-6 col-sm-12">
            <div class="login-form">
    
    
  </div>
</div>
<table>
  <form action="AdminLoginServlet" method="post">
  
  <tr><td><div style="color: #FF0000;"> <span class="error">${message}</span></div><br></td></tr>
  <tr><td><label>Admin Name</label></td>
  <td><input type="text"  name="name" /></td></tr>
  <tr><td><label>Email Address</label></td>
  <td><input type="email" name="email" /></td></tr>
 <tr><td><input type="submit" value="Login"></td></tr>
 
 </form>
 </table>

</body>
</html>