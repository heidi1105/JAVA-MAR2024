<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> Review Result</h1>
	<h3> Title: <c:out value="${title }"/></h3>
	<h3> Reviewer: <c:out value="${reviewer }"/></h3>
	<h3> Rating: <c:out value="${rating }"/></h3>
	<h3> Description: <c:out value="${description }"/></h3>
</body>
</html>