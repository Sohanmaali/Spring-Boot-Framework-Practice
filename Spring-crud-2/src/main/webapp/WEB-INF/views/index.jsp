<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
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
				<c:choose>
					<c:when test="${not empty product}">
						<thead>
							<tr class=" bg-info">
								<th scope="col">S. No.</th>
								<th scope="col">Name</th>
								<th scope="col">Price</th>
								<th scope="col">Descreption</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>


							<c:forEach var="p" items="${product}">
								<tr>
									<th scope="col">${p.id}</th>
									<th scope="col">${p.productName}</th>
									<th scope="col">${p.productPrice}</th>
									<th scope="col">${p.productDescription}</th>
									<td>
										<%-- <a href="editProduct/${p.id}/${p.productName}/${p.productPrice}/${p.productDescription}"
										class="btn btn-info">Edit</a> --%> <a
										href="editProduct/${p.id}" class="btn btn-info">Edit</a> <a
										href="deleteProduct/${p.id }" class="btn btn-danger">Delete</a>
									</td>
								</tr>
							</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
							<td colspan="5" class="h3 text-center">No products found.</td>
						</tr>
					</c:otherwise>
				</c:choose>

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