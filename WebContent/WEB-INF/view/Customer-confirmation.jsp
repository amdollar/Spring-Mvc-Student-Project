<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer confirmation form</title>
</head>
<body>
 	Congrats ! , You are registered successfully.
 	Name : ${customer.firstName}
 	<br> <br>
 	Total Free Passes : ${customer.freePasses}
 	
 	<br><br>
 	Postal Code : ${customer.postalCode}
 	
 	
</body>
</html>