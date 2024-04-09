<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>

<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>This is about page</h1>
	<h1>
		And i am
		<%=request.getAttribute("name")%>
	</h1>
	<h1>
		Let's start
		<%=request.getAttribute("cod")%>
	</h1>

	<h1>
		<%
		List<String> f = (List<String>) request.getAttribute("friends");
		for (String s : f) {
			out.println(s);
		}
		%>
	</h1>
</body>
</html>