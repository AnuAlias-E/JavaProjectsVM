<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
			<td><h2>Employee Details</h2></td>
			
		</tr>
		<tr>
			<td>Employee Id</td>
			<td>${requestScope.emp.id }</td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td>${requestScope.emp.name }</td>
		</tr>
		<tr>
			<td>Gender</td>
			<td>${requestScope.emp.gender }</td>
		</tr>
		<tr>
			<td>Basic Salary</td>
			<td>${requestScope.emp.basicSalary }</td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td>${requestScope.emp.allowance }</td>
		</tr>
		<tr>
			<td>Deduction</td>
			<td>${requestScope.emp.deduction }</td>
		</tr>
		<tr>
			<td>Net Salary</td>
			<td>${requestScope.emp.netSalary }</td>
		</tr>
	</table>
</body>
</html>