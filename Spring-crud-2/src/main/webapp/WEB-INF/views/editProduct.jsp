<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	font-family: "Poppins", sans-serif;
}

body {
	min-height: 100vh;
	display: flex;
	align-items: center;
	justify-content: center;
	background: #4070f4;
}

.wrapper {
	position: relative;
	max-width: 430px;
	width: 100%;
	background: #fff;
	padding: 34px;
	border-radius: 6px;
	box-shadow: 0 5px 10px rgba(0, 0, 0, 0.2);
}

.wrapper h2 {
	position: relative;
	font-size: 22px;
	font-weight: 600;
	color: #333;
}

.wrapper form {
	margin-top: 30px;
}

.wrapper form .input-box {
	height: 52px;
	margin: 18px 0;
}

form .input-box input {
	height: 100%;
	width: 100%;
	padding: 0 15px;
	font-size: 17px;
	font-weight: 400;
	color: #333;
	border: 1.5px solid #c7bebe;
	border-bottom-width: 2.5px;
	border-radius: 6px;
}

form h3 {
	color: #707070;
	font-size: 14px;
	font-weight: 500;
	margin-left: 10px;
}

.input-box.button input {
	color: #fff;
	border: none;
	background: #4070f4;
}

.input-box.button input:hover {
	background: #0e4bf1;
}

form .text h3 {
	color: #333;
	width: 100%;
	text-align: center;
}

form .text h3 a {
	color: #4070f4;
	text-decoration: none;
}

form .text h3 a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="wrapper">
		<h2>Registration</h2>
		<form action="${pageContext.request.contextPath }/addproductsub"
			method="post">
			<div class="input-box">
				<!-- 	<label>Product Id</label> -->
				<input type="text" placeholder="Product id" readonly
					value="${product.id }" name="id" />
			</div>
			<div class="input-box">
				<input type="text" placeholder="Enter Product Name" readonly
					required value="${product.productName }" name="productName" />
			</div>
			<div class="input-box">
				<input type="text" placeholder="Enter Product Price" required
					value="${product.productPrice }" name="productPrice" />
			</div>
			<div class="input-box">
				<input type="tel" placeholder="Enter Product Description" required
					value="${product.productDescription }" name="productDescription" />
			</div>

			<div class="input-box button">
				<input type="Submit" value="Update" />
			</div>
			<div class="input-box button">
				<a href="back" class="btn btn-info">Back</a>
			</div>

		</form>
	</div>
</body>
</html>
