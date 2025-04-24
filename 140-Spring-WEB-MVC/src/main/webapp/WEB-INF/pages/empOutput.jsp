<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">

		<tr>
			<td>Id:</td>
			<td>${requestScope.empl.id }</td>
		</tr>
		<tr>
			<td>Name:</td>
			<td>${requestScope.empl.name }</td>
		</tr>
		<tr>
			<td>Gender:</td>

			<td>${requestScope.empl.gender }</td>
		</tr>
		<tr>
			<td>City:</td>
			<td>${requestScope.empl.city }</td>
		</tr>
		<tr>
			<td>Basic Salary:</td>
			<td>${requestScope.empl.basic }</td>
		</tr>
		<tr>
			<td>Allowance:</td>
			<td>${requestScope.empl.allowance }</td>
		</tr>
		<tr>
			<td>Tax:</td>
			<td>${requestScope.empl.tax }</td>
		</tr>
		<tr>
			<td>Net Salary:</td>
			<td>${requestScope.empl.netSalary }</td>
		</tr>

	</table>
</body>
</html>