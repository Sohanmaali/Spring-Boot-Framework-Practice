<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@ page isELIgnored="false"%>

<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${name}</h1>
	<h1>${marks}</h1>
	<h1>Sohan</h1>
	<%-- <c:forEach var="item" items="${marks }">
		<h1>${item}</h1>
	</c:forEach> --%>
	<%
	List<Integer> marks = (List<Integer>) request.getAttribute("marks");
	for (Integer s : marks) {
	%>
	<h3><%=s%></h3>

	<%
	}
	%>
</body>
</html>
