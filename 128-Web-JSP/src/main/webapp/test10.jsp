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
			<td><jsp:getProperty property="id" name="employee" /></td>
		</tr>
		<tr>
			<td>Employee Name</td>
			<td><jsp:getProperty property="name" name="employee" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><jsp:getProperty property="gender" name="employee" /></td>
		</tr>
		<tr>
			<td>Basic Salary</td>
			<td><jsp:getProperty property="basicSalary" name="employee" /></td>
		</tr>
		<tr>
			<td>Allowance</td>
			<td><jsp:getProperty property="allowance" name="employee" /></td>
		</tr>
		<tr>
			<td>Deduction</td>
			<td><jsp:getProperty property="deduction" name="employee" /></td>
		</tr>
		<tr>
			<td>Net Salary</td>
			<td><jsp:getProperty property="netSalary" name="employee" /></td>
		</tr>
	</table>
</body>
</html>