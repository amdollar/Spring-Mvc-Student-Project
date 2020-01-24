<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.error {
	color: red;
}
</style>

<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form:form action="processStudentForm" modelAttribute="student">
		First name : <form:input type="text" path="firstName" />
		<br>
		<br>
		Last name : <form:input type="text" path="lastName" />
		<form:errors cssClass="error" />
		<br>
		<br>
		Language : 
		Java<form:radiobutton path="language" value="Java" />
		Python<form:radiobutton path="language" value="Python" />
		JScript<form:radiobutton path="language" value="JScript" />
		Ruby<form:radiobutton path="language" value="Ruby" />
		R<form:radiobutton path="language" value="R" />
		<br>
		<br>
		Country :
		<form:select path="country">
			<form:options items="${student.countrySelectValues}" />
		</form:select>
		<br>
		<br>
		Operating systems : 
		Linux<form:checkbox path="operatingSystems" value="Linux" />
		Unix<form:checkbox path="operatingSystems" value="Unix" />
		Windows Family<form:checkbox path="operatingSystems"
			value="Windows Family" />
		Android<form:checkbox path="operatingSystems" value="Android" />
		<br>

		<br>

		<input type="submit" value="Submit">
	</form:form>
</body>
</html>