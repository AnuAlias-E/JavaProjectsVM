<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h2>Employee List Details</h2>
<body>
	<table  border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Basic Salary</th>
			<th>Allowance</th>
			<th>Tax</th>
			<th>Net Salary</th>
		</tr>

		<c:forEach items="${requestScope.emps }" var="e">
			<tr>
				<td><c:out value="${e.id }"></c:out></td>
				<td><c:out value="${e.name }"></c:out></td>
				<td><c:out value="${e.gender }"></c:out></td>
				<td><c:out value="${e.basic }"></c:out></td>
				<td><c:out value="${e.allowance }"></c:out></td>
				<td><c:out value="${e.tax }"></c:out></td>
				<td><c:out value="${e.netSalary }"></c:out></td>
			</tr>

		</c:forEach>

	</table>
</body>
</html>