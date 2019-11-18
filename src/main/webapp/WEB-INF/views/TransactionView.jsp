<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Manage Vehicle Records</title>
<table id="myTable" class="display table" width="100%" > 
        <thead>  
          <tr>  
            <th>ReservationId</th>  
            <th>Start Date</th>  
            <th>Due Date</th>  
            <th>ClientDL</th>  
            <th>LicenseNumber</th>
            <th>Reserved</th>
          </tr>  
        </thead>  
        <tbody>  
        
	<tr>	
	  <tr>

<<td>${transaction.reservationId}</td>
<td>${transaction.startdate}</td>
<td>${transaction.duedate}</td>
<td>${transaction.licenseNumber}</td>
<td>${transaction.licensePlate}</td>
<td>${transaction.status}</td>
<td>${status}</td>
<c:forEach var="transactionItem" items="${list}">
<tr>
<td><c:out value="${transactionItem.reservationId}"></c:out></td>
<td><c:out value="${transactionItem.startdate}"></c:out></td>
<td><c:out value="${transactionItem.duedate}"></c:out></td>
<td><c:out value="${transactionItem.licenseNumber}"></c:out></td>
<td><c:out value="${transactionItem.licensePlate}"></c:out></td>
<td><c:out value="${transactionItem.status}"></c:out></td>

</tr>
</c:forEach>
<%-- <td>${transaction.Status}</td> --%>
</tr>


        </tbody>  
      </table> 
</div>
</body>
</html>