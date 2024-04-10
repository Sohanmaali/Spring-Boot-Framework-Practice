<%@page import="java.util.List"%>
<%@page import="com.mvc.entites.Product"%>

<%@ page isELIgnored="false"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Bootstrap demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row mt-5">
			<span class="h1 text-center">All product</span>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<table class="table">
				<thead>
					<tr>
						<th scope="col">S. No.</th>
						<th scope="col">Name</th>
						<th scope="col">Price</th>
						<th scope="col">Descreption</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>

					<%
					@SuppressWarnings("unchecked")

					List<Product> products = (List<Product>) request.getAttribute("products");
					if (products != null) {
						for (Product product : products) {
					%>
					<tr>
						<td><%=product.getId()%></td>
						<td><%=product.getProductName()%></td>
						<td><%=product.getProductPrice()%></td>
						<td><%=product.getProductDescription()%></td>
						<td></td>
						<td><a href="deleteProduct/<%=product.getId()%>"
							class="btn btn-danger">Delete</a></td>
					</tr>
					<%
					}
					} else {
					%>
					<tr>
						<td colspan="4" class="text-center h3">No products found</td>
					</tr>
					<%
					}
					%>
				</tbody>
			</table>
		</div>
	</div>

	<div class="container">
		<div class="row mt-5">
			<span class="h1 text-center"><a href="addProduct"
				class="btn btn-warning">Add Product</a></span>
		</div>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
		crossorigin="anonymous"></script>
</body>
</html>