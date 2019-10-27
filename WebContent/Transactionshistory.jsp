<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Manage Vehicle Records</title>
   


    
<link href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css" rel="stylesheet">   
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
<link rel="stylesheet" 

href="http://cdn.datatables.net/1.10.2/css/jquery.dataTables.min.css"></style>
<script type="text/javascript" 

src="http://cdn.datatables.net/1.10.2/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" 

src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
</head>
<body>
    <div id="jquery-script-menu">
<div class="table-responsive">
<table id="myTable" class="display table" width="100%" > 
        <thead>  
          <tr>  
            <th>CNo</th>  
            <th>ClientName</th>  
            <th>CarName</th>  
            <th>Due Date</th>  
            <th>Status</th>
          </tr>  
        </thead>  
        <tbody>  
          <tr>  
            <td>001</td>  
            <td>Anusha</td>  
            <td>SUV</td>  
            <td>09/10/2018</td>  
            <td>Reserved</td>
          </tr>  
           <tr>  
            <td>002</td>  
            <td>Sahana</td>  
            <td>Sedan</td>  
            <td>09/11/2018</td>  
            <td>Cancelled</td>
          </tr> 
         
        </tbody>  
      </table> 
</div>
</body>
<script>
$(document).ready(function(){
    $('#myTable').dataTable();
});
</script>
	</html>