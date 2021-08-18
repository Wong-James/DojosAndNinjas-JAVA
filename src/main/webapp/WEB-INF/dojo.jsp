<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Dojo</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css">
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>New Dojo</h1>
	<form:form action="/dojos" method="post" modelAttribute="dojo">
    	<p>
        	<form:label path="name">Name</form:label>
        	<form:errors path="name"/>
        	<form:input path="name"/>
    	</p>
    	<input type="submit" value="Submit"/>
    </form:form>
	

</body>
</html>