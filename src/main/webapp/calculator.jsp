<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<c:set var="name" value="${sessionScope.guest}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${name}&apos;s Personalized Calculator</title>
<link rel="stylesheet" type="text/css" href="calculator.css">
</head>
<body>
	<h1>Hi, ${name}</h1>
	<form method="get" action="calculator">
	<div>
		<label for="operation">What would you like to do?</label>
		<select name="operation">
			<option value="1">Add</option>
			<option value="2">Subtract</option>
			<option value="3">Multiply</option>
			<option value="4">Divide</option>
			<option value="5">Factorial</option>	
		</select>
	</div>
	<div>
	<label for="operands">Please enter some numbers (separated by spaces)</label>
	<input name="operands" type="text"></input>
	</div>
	</form>
	<div>${requestScope.resultText}</div>
	<a href="logout">Log out</a>
</body>
</html>