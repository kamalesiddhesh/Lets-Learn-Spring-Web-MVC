<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<title>Simple Web Application</title>
</head>
<body>
	<center>
		<h1>Welcome to Spring Boot Login Page</h1>

		<h2>Login To Proceed</h2>
		<font color="red">${errorMessage}</font>
		<form method="post">
			User Name : <input type="text" name="name" /><br>
			<br> Password : <input type="password" name="password" /><br>
			<br> <input type="submit" />
		</form>
	</center>
</body>
</html>