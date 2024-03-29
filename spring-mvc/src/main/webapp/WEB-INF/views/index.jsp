<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>this is home page</h1>
	<h1>call by controller</h1>
	<%
	String name = (String) request.getAttribute("name");
	%>
	<h1>call by controller</h1>
	<h1>
		My Name is
		<%=name%>
	</h1>

	<h1>
		My Mobile is
		<%=(String) request.getAttribute("mobile")%>
	</h1>
	<h1>
		<center>All Friends</center>
	</h1>
	<%
	List<String> fl = (List<String>) request.getAttribute("f");

	for (String fd : fl) {
	%>
	<h1><%=fd%></h1>
	<%
	}
	%>

</body>
</html>