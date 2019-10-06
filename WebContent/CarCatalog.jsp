<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Car Catalog</title>
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
<sql:setDataSource
        var="carrental"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/carrental"
        user="root" password="Kiran@28"
    />

    <sql:query var="listcar"   dataSource="${carrental}">
        SELECT * FROM tbl_car;
    </sql:query>

    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Cars</h2></caption>
            <tr>
                <th>Type</th>
                <th>Make</th>
                <th>Year</th>
                <th>Model</th>
                <th>Color</th>
                <th>LicensePlate</th>
                
            </tr>
           
                <tr>
                    <td>SUV</td>
                    <td>VOLVO></td>
                    <td>2015</td>
                    <td>X90</td>
                    <td>WHITE</td>
                    <td>A1C 2B3</td>
                    
                </tr>
           <tr>
                    <td>HATCHBACK</td>
                    <td>FORD</td>
                    <td>2016</td>
                    <td>FIGO</td>
                    <td>BLACK</td>
                    <td>V5F 3F4</td>
                    
                </tr>
                <tr>
                    <td>SEDAN</td>
                    <td>VOLKSWAGON</td>
                    <td>2019</td>
                    <td>PASSAT</td>
                    <td>WHITE</td>
                    <td>R5T 6Y7</td>
                    
                </tr>
                
                 <tr>
                    <td>SEDAN</td>
                    <td>HONDA</td>
                    <td>2015</td>
                    <td>CITY</td>
                    <td>GREY</td>
                    <td>Y7U 4H6</td>
                    
                </tr>
                <tr>
                    <td>HATCHBACK</td>
                    <td>KIA</td>
                    <td>2017</td>
                    <td>CEED</td>
                    <td>WHITE</td>
                    <td>N6T 5H8</td>
                    
                </tr>
                <tr>
                    <td>SUV</td>
                    <td>MAHINDRA></td>
                    <td>2017</td>
                    <td>BOLERO</td>
                    <td>WHITE</td>
                    <td>V4V 8I8</td>
                    
                </tr>
        </table>
    </div>

    


</body>
</html>