<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Getting Started: Handling Form Submission</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<!--  
<body>
	<h1>Form</h1>
    <form action="#" th:action="@{/greeting}" th:object="${greeting}" method="post">
    	<p>Id: <input type="text" th:field="*{id}" /></p>
        <p>Message: <input type="text" th:field="*{content}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
-->
<!-- tämä formaatti toimii, ylempi ei -->
<form action="greeting" method="post"> <!-- action = controllerin requestemapperin value -->
<input type="text" name="id"><br> <!-- ilmeisesti pitää vastata olion attribuutin nimeä -->
<input type="text" name="content"><br>
<input type="submit" value="Login">
</body>
</html>