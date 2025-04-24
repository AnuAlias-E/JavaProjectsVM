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
	<table border="1">

		<tr>
			<td>Roll Number :</td>
			<td><c:out value="${requestScope.stu.rollNumber}"></c:out></td>
		</tr>
		<tr>
			<td>Name:</td>
			<td><c:out value="${requestScope.stu.name}"></c:out></td>
		</tr>
		<tr>
			<td>Gender:</td>
			<td><c:out value="${requestScope.stu.gender}"></c:out></td>
		</tr>
		<tr>
			<td>Mark 1:</td>
			<td><c:out value="${requestScope.stu.mark1}"></c:out></td>
		</tr>
		<tr>
			<td>Mark 2:</td>
			<td><c:out value="${requestScope.stu.mark2}"></c:out></td>
		</tr>
		<tr>
			<td>Total:</td>
			<td><c:out value="${requestScope.stu.total}"></c:out></td>
		</tr>
		<tr>
			<td>Average:</td>
			<td><c:out value="${requestScope.stu.average}"></c:out></td>
		</tr>


	</table>
</body>
</html>