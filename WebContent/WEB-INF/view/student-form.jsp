<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>
<html>

<head>
	<title> Student registration form </title>
</head>

<body>
	
	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />
	
	<br><br>
	
	Last Name: <form:input path="lastName" />
	
	<input type="submit" value="Submit" />
	
	<br><br>
	
	</form:form>
	
</body>

</html>