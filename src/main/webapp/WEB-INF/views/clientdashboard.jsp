<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
  </head>
  <body>
  <h3>${us.userName} Welcome</h3>
 
     <td><a href="client/${us.userName}">Add, Delete, Modify Clients</a>
               </td>
               <br>
               <br>
               <br>
               <td><a href="carCatalogueSearch">View Car Catalog</a>
               </td>
               <br>
               <br>
               <br>
                <td><a href="handleReservation">Handle Reservation</a>
                </td>
               <br>
               <br>
               <br>
               <td><a href="handleRental">Handle Rental</a>
               </td>	
               <br>
               <br>
               <td><a href="clerklogout/${us.userName}">Logout</a>
               </body>
               
               
               
           </html>