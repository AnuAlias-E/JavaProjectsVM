<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employee" class="com.training.model.Employee" scope="request"></jsp:useBean>
<table>
<tr>
			<td><h2>Employee Details</h2></td>
			
		</tr>
		<tr>
			<td>Employee Id</td>
			<td>${requestScope.employee.id }</td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td>${requestScope.employee.name }</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${requestScope.employee.gender }</td>
		</tr>
		<tr>
			<td>Basic Salary</td>
			<td>${requestScope.employee.basicSalary }</td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td>${requestScope.employee.allowance }</td>
		</tr>
		<tr>
			<td>Deduction</td>
			<td>${requestScope.employee.deduction }</td>
		</tr>
		<tr>
			<td>Net Salary</td>
			<td>${requestScope.employee.netSalary }</td>
		</tr>
	</table>
</body>
</html>