<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.error {
	color: red;
}
</style>
<title>Customer Registration Form</title>
<i>(*) values are mandatory</i>
</head>
<body>
	<br>
	<br>
	<form:form action="processCustomerForm" modelAttribute="customer">
		First Name : <form:input type="text" path="firstName"
			placeholder="First Name" />
		<br>
		<br>
		Last Name (*) : <form:input type="text" placeholder="Last Name"
			path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
		Free Passes : <form:input type="text" placeholder="Free Passes"
			path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
		Postal Code: <form:input type="text" path="postalCode"
			placeholder="Postal Codes" />
		<form:errors path="postalCode" cssClass=" error"/>
		<br>
		<br>

		<input type="submit" value="Proceed" />
	</form:form>
</body>
</html>