<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Vehicle Details</h3>
      <form action="addCarProcess" modelAttribute="addCar" method="post">
                <table align="center">
                   
		<tr>
		    <td>CarID</td>
		    <td><input name="carId" size="30" required="required" /></td>
		</tr>
		
		<tr>
		    <td>Type:</td>
		    <td><input type="text" name="type" size="30" required="required"/></td>
		</tr>
		<tr>
		    <td>Make: </td>
		    <td><input name="make" size="30" required="required" /></td>
		</tr>
		
		<tr>
		    <td>Model:</td>
		    <td><input type="text" name="model" size="30" required="required"/></td>
		</tr>
		<tr>
		    <td>Year:</td>
		    <td><input type="text" name="year" size="30" required="required"/></td>
		</tr>
		<tr>
		    <td>Color:</td>
		    <td><input type="text" name="color" size="30" required="required"/></td>
		</tr>
		<tr>
		    <td>License Plate:</td>
		    <td><input type="text" name="licenseNum" value="ex: XCB468" pattern="[a-zA-Z]{3}[0-9]{3}" size="30" required="required"/></td>
		</tr>
		
		<tr>
		    <td>Status</td>
		    <td><input type="text" name="status" size="30" required="required"/></td>
		</tr>
		<tr>
		    <td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
				
                </table>
            </form>
    </body>
</html>