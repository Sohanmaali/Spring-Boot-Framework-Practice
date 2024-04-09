
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Registration Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

.container {
	max-width: 500px;
	margin: 20px auto;
	padding: 20px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.form-group {
	margin-bottom: 20px;
}

label {
	display: block;
	font-weight: bold;
	margin-bottom: 5px;
}

input[type="text"], input[type="email"], select {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	font-size: 16px;
}

input[type="date"] {
	width: 100%;
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	font-size: 16px;
}

input[type="radio"] {
	margin-right: 5px;
}

.form-actions {
	text-align: center;
}

button {
	padding: 10px 20px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
}

button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>

	<div class="container">
		<h2>Registration Form</h2>

		<h4>
			<form:errors path="user.*" />
		</h4>

		<form action="registrationsub" method="post">
			<div class="form-group">
				<label for="name">Name:</label> <input type="text" id="name"
					name="name" required>
			</div>
			<div class="form-group">
				<label for="id">Your id:</label> <input type="text" id="id"
					name="id" required>
			</div>
			<div class="form-group">
				<label for="dob">Date of Birth:</label> <input type="text" id="dob"
					name="dob" placeholder="dd/mm/yyyy" required>
			</div>
			<div class="form-group">
				<label for="course">Select Course:</label> <select id="course"
					name="course" required multiple>

					<option>Java</option>
					<option>Python</option>
					<option>c++</option>
					<option>c</option>
				</select>
			</div>
			<div class="form-group">
				<label>Gender:</label> <input type="radio" id="male" name="gender"
					value="male" required> <label for="male">Male</label> <input
					type="radio" id="female" name="gender" value="female" required>
				<label for="female">Female</label>
			</div>
			<div class="form-group">
				<label for="type">Select Type:</label> <select id="type" name="type"
					required>
					<option value="">Select Type</option>
					<option value="type1">Type 1</option>
					<option value="type2">Type 2</option>
					<option value="type3">Type 3</option>
				</select>
			</div>
			<div class="form-actions">
				<button type="submit">Submit</button>
			</div>
		</form>
	</div>

</body>
</html>
