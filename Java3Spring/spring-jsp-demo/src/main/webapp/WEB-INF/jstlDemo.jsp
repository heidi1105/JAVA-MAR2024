<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> JSTL demo</h1>
	<h3> Name: 
		<c:out value="${name }"/>
	</h3>
	
	<h3> Happiness: ${jspHappiness }
		<c:out value="${jspHappiness }"></c:out>
	</h3>
	<h3> Hacker Code: 
		<c:out value="${hackerCode }"/>
	</h3>
	
	<h2> If-statement</h2>
	<c:if test="${ jspHappiness >5 }">
		<h3> I am very happy</h3>
	</c:if>
	
	<h2> If-else statement</h2>
	<c:choose>
		<c:when test="${jspHappiness < 5 }">
			<h3> Happiness is less than 5</h3>
		</c:when>
		<c:otherwise>
			<h3> Happiness is more than 5</h3>
		</c:otherwise>
	</c:choose>
	
	
	<h2> ForEach</h2>
	<ul>
	<c:forEach var="eachSkill" items="${jspSkills }">
		<li><c:out value="${eachSkill }"/> </li> 
	</c:forEach>
	</ul>
</body>
</html>





































