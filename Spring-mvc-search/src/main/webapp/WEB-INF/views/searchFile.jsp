<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Searching Card</title>
<style>
body {
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
	background-color: #f4f4f4;
}

.card {
	width: 600px;
	background-color: #fff;
	border-radius: 8px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
	padding: 20px;
	margin: 20px auto;
	box-sizing: border-box;
}

.search-input {
	width: 100%;
	padding: 8px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	font-size: 16px;
}

.search-button {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 16px;
}

.search-button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>

	<div class="card">
		<center>
			<h2>Search your Topic Here</h2>
		</center>
		<form action="search" >
			<input type="text" name="query" class="search-input"
				placeholder="Enter your search query">
			<button type="submit" class="search-button">Search</button>
		</form>
	</div>

</body>
</html>
