<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>


<h1>
	Welcome to Car Rental Services  
</h1>

<P>  The time on the server is ${serverTime}.</P>
<table align="center">
           <tr>
               <td><a href="login">Clerk Login</a>
               </td>
               <td><a href="adminlogin">Admin Login</a>
               </td>
           </tr>
       </table>
</body>
</html>
