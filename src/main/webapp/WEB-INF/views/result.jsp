<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Result</h1>
    id ${greeting.id}<br>
    content ${greeting.content}<br>
    lista ${lista}<br>
		
	<c:forEach items="${lista}" var="listItem">
      aas  ${listItem} <br/>
     
    </c:forEach>	
    <a href="/greeting">Submit another message</a>
</body>
</html>