<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>


<h1>
	Login Page
</h1>

<P>  ClerkLogin</P>


<form action="loginProcess" modelAttribute="login" method="post">
                <table align="center">
                   
		<tr>
		    <td>User Name:</td>
		    <td><input name="userName" size="30" required="required" /></td>
		</tr>
		
		<tr>
		    <td>Password:</td>
		    <td><input type="password" name="Password" size="30" required="required"/></td>
		</tr>
		
		<tr>
		    <td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
				
                </table>
            </form>
            <table align="center">
                <tr>
                    <td style="font-style: italic; color: red;">${message}</td>
                </tr>
            </table>
</body>
</html>
