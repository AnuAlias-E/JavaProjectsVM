<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<jsp:useBean id="stud" class="com.training.model.Student" scope="request"></jsp:useBean>
<table>
		<tr>
			<td>Roll Number</td>
			<td><jsp:getProperty property="rollNo" name="stud" /></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><jsp:getProperty property="name" name="stud" /></td>
		</tr>
		<tr>
			<td>Gender</td>
			<td><jsp:getProperty property="gender" name="stud" /></td>
		</tr>
		<tr>
			<td>Mark1</td>
			<td><jsp:getProperty property="mark1" name="stud" /></td>
		</tr>
		<tr>
			<td>Mark2</td>
			<td><jsp:getProperty property="mark2" name="stud" /></td>
		</tr>
		<tr>
			<td>Total</td>
			<td><jsp:getProperty property="total" name="stud" /></td>
		</tr>
		<tr>
			<td>Average</td>
			<td><jsp:getProperty property="average" name="stud" /></td>
		</tr>
	</table>
</body>
</html>