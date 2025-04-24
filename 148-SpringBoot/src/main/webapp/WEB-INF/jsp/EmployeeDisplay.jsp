<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Employee Details</h2>
<table border="1">
		<tr>
			<td>ID</td>
			<td><c:out value="${requestScope.emp.id} "></c:out></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><c:out value="${requestScope.emp.name} "></c:out></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><c:out value="${requestScope.emp.gender} "></c:out></td>
		</tr>
		<tr>
			<td>Basic Salary</td>
			<td><c:out value="${requestScope.emp.basic} "></c:out></td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td><c:out value="${requestScope.emp.allowance} "></c:out></td>
		</tr>
		<tr>
			<td>Tax</td>
			<td><c:out value="${requestScope.emp.tax} "></c:out></td>
		</tr>
		<tr>
			<td>Net Salary</td>
			<td><c:out value="${requestScope.emp.netSalary} "></c:out></td>
		</tr>
	</table>
</body>
</html>