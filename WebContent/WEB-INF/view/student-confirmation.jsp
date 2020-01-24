<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.test {
	color: red;
}
</style>
<meta charset="ISO-8859-1">
<title>Student confirmation page</title>
</head>

<body>
	<h1 class="test">Hi ${student.firstName}, Registration
		successful..!</h1>
		Country : ${student.country}
		<br>
		<br>
		Language : ${student.language}
		<br>
		<br>
		Operating Systems:
		<ul>
		<c:forEach var ="temp" items="${student.operatingSystems}">
			 <li>${temp}</li>
		</c:forEach>
		</ul>
		</body>
</html>