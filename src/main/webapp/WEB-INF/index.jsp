<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- c:out ; c:forEach etc. --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- Formatting (dates) --> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Dojo's Home Page</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Dojo's and Ninjas</h1>
	<a href="/dojos/new">Create a Dojo</a>
	<br/>
	<a href="/ninjas/new">Create a Ninja</a>
	<br/>
	<a href="/dojos/display">Show all Dojos</a>
	

</body>
</html>