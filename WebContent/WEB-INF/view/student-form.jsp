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
	
	<br><br>
	
	Country:
	
	<form:select path="country">
	
		<form:options items="${student.countryOptions}" />
	
   <!-- <form:option value="Brazil" label="Brazil" />
		<form:option value="France" label="France" />
		<form:option value="Germany" label="Germany" />
		<form:option value="India" label="India" /> -->
	
	</form:select>
	
	<br><br>
	
	Favorite language:
	
		Java <form:radiobutton path="favoriteLanguage" value="Java" />
		C# <form:radiobutton path="favoriteLanguage" value="C#" />
		PHP <form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby" />
	<br><br>
	
	<input type="submit" value="Submit" />
	
	</form:form>
	
</body>

</html>