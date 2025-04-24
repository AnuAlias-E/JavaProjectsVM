<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
			<tr>
				<th>Employee Id</th>
				<th>Employee Name</th>
				<th>Gender </th>
				<th>City</th>
				<th>Basic Salary</th>
				<th>Allowance</th>
				<th>Tax</th>
				<th>Net Salary</th>
			</tr>
			<c:forEach items="${requestScope.employeeList }" var="employee">
				<tr>
					<td><c:out value="${employee.id }"></c:out></td>
					<td><c:out value="${employee.name }"></c:out></td>
					<td><c:out value="${employee.gender }"></c:out></td>
					<td><c:out value="${employee.city }"></c:out></td>
					<td><c:out value="${employee.basic }"></c:out></td>
					<td><c:out value="${employee.allowance}"></c:out></td>
					<td><c:out value="${employee.tax }"></c:out></td>
					<td><c:out value="${employee.netSalary }"></c:out></td>
					
				</tr>

			</c:forEach>

		</table>
</body>
</html>