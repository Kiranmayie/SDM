
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create new client records</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" integrity="sha512-dTfge/zgoMYpP7QbHy4gWMEGsbsdZeCXz7irItjcC3sPUFtf0kuFbDz/ixG7ArTxmDjLXDmezHubeNikyKGVyQ==" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" integrity="sha384-aUGj/X2zp5rLCbBxumKTCw2Z50WgIr1vs/PFN4praOTvYXWlVyh2UtNUU0KAUhAX" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" integrity="sha512-K1qjQ+NcF2TYO/eI3M6v8EiNYZfA95pQumfvcVrTHtwQVDG+aHRqLi/ETn2uB+1JqwYqVG3LIvdm9lj6imS/pQ==" crossorigin="anonymous"></script>
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
</head>
<body>
<h2><b>Add Client records</b></h2>
        <div class="container">
            <form class="form-horizontal" role="form" action="AddClientsServlet" method="post"><br>
                <div class="form-group">
                    <label for="First Name">First Name</label>
                    <input type="text" class="form-control" name="firstname">
                </div>
                <div class="form-group">
                    <label for="Last Name">Last Name</label>
                    <input type="text" class="form-control" name="lastname">
                </div>
                <div class="form-group">
                    <label for="driverlicense">Driver Licence</label>
                    <input type="text" class="form-control" name="DriverLicense">
                </div>
                 <div class="form-group">
                    <label for="expirationdate">Expiration Date</label>
                    <input type="date" class="form-control" name="expirationdate">
                </div>
                <div class="form-group">
                    <label for="PhoneNumber">Phone Number</label>
                    <input type="text" class="form-control" name="PhoneNumber">
                </div><br>
                <button type="submit"><b>Submit</b></button><br><br>
            </form>
        </div><br>

</body>
</html>