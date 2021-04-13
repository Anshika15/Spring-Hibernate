<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!Doctype html>
<html>

<head>
	<title> Customer registration Confirmation </title>
</head>

<body>
	
	The customer is Confirmed: ${customer.firstName} ${customer.lastName}
	
	<br><br>
	
	Free passes: ${customer.freePasses}
	
	<br><br>
	
	Postal code: ${customer.postalCode}
</body>

</html>