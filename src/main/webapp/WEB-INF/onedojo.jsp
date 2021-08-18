<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	
	<h1><c:out value="${dojo.name}"></c:out> Ninjas</h1>
	
	
	<table>
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>Age</th>
		</tr>
		<c:forEach items="${ dojo.ninjas }" var="ninja">
			<tr>
				<td> <c:out value="${ ninja.firstName }"></c:out> </td>
				<td> <c:out value="${ ninja.lastName }"></c:out> </td>
				<td> <c:out value="${ ninja.age }"></c:out> </td>
			</tr>
		</c:forEach>
	</table>
	<a href="/">Dashboard</a>
</body>
</html>