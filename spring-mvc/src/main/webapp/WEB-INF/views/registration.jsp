<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Form</title>
<style>
form {
	width: 300px;
	margin: 0 auto;
}

input[type="text"], input[type="email"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin: 5px 0;
	border-radius: 5px;
	border: 1px solid #ccc;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	margin-top: 10px;
	border: none;
	background-color: #007bff;
	color: #fff;
	border-radius: 5px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<center>
		<h2>Registration Form</h2>
		
		
	</center>
	<form action="registrationData" method="post">
		<label for="username">Username:</label> <input type="text"
			id="username" name="userName" required> <label for="email">Email:</label>
		<input type="email" id="email" name=userEmail required> <label
			for="password">Password:</label> <input type="password" id="password"
			name="userPassword" required> <label for="confirm_password">Confirm
			Password:</label> <input type="password" id="confirm_password"
			name="confirm_password" required> <input type="submit"
			value="Register">
	</form>
</body>
</html>
