<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<H1>Add New Student</H1>
	<table>
		<form:form action="AddStudent2" method="POST" modelAttribute="stud">
			<tr>
				<td><label><h2>Enter Student Details</h2></label></td>
			</tr>
			<tr>
				<td><label>Student Roll Number :</label></td>
				<td><form:input path="rollNumber"/></td>
			</tr>
			<tr>
				<td><label>Student Name :</label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><label>Gender :</label></td>
				<td><form:select path ="gender">
						<form:option value="M">Male</form:option>
						<form:option value="F">Female</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><label>Mark 1 :</label></td>
				<td><form:input path="mark1"/></td>
			</tr>
			<tr>
				<td><label>Mark 2 :</label></td>
				<td><form:input path="mark2"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Add Details"></td>
			</tr>
		</form:form>

	</table>

</body>
</html>