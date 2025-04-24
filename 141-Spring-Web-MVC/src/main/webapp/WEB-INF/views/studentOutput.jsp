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
			<td>Roll Number :</td>
			<td>${requestScope.stu.rollNumber}</td>
		</tr>
		<tr>
			<td>Name:</td>
			<td>${requestScope.stu.name }</td>
		</tr>
		<tr>
			<td>Gender:</td>

			<td>${requestScope.stu.gender }</td>
		</tr>
		<tr>
			<td>Mark 1:</td>
			<td>${requestScope.stu.mark1 }</td>
		</tr>
		<tr>
			<td>Mark 2:</td>
			<td>${requestScope.stu.mark2 }</td>
		</tr>
		<tr>
			<td>Total:</td>
			<td>${requestScope.stu.total }</td>
		</tr>
		<tr>
			<td>Average:</td>
			<td>${requestScope.stu.average }</td>
		</tr>
		

	</table>
</body>
</html>