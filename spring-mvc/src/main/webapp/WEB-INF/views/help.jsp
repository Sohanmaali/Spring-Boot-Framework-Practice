<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>this is help page</h1>
	<h1>call by controller</h1>
	
	<h1>
		My Name is
		<%=(String) request.getAttribute("name")%>
	</h1>
</body>
</html>