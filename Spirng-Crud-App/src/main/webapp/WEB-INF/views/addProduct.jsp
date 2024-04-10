<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Add Product</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
}

form {
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
	width: 300px;
}

h2 {
	text-align: center;
	margin-bottom: 20px;
}

label {
	font-weight: bold;
}

input[type="text"], input[type="number"], textarea {
	width: 100%;
	padding: 8px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
}

textarea {
	height: 100px;
}

input[type="submit"] {
	background-color: #4caf50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	width: 100%;
	font-size: 16px;
}

input[type="submit"]:hover {
	background-color: #45a049;
}
</style>
</head>
<body>
	<form action="addproductsub" method="post">
		<h2>Add Product</h2>
		<label for="name">Name:</label><br> <input type="text" id="name"
			name="productName"><br> <label for="price">Price:</label><br>
		<input type="number" id="price" name="productPrice"><br> <label
			for="description">Description:</label><br>
		<textarea id="description" name="productDescription"></textarea>
		<br> <br> <input type="submit" value="Submit">
	</form>
</body>
</html>
