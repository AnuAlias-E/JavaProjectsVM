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
		<form action="ECS" method="POST">
		<tr>
				<td><label><h2>Enter Employee Details</h2></label></td>
				</tr>
			<tr>
				<td><label>Employee Id:</label></td>
				<td><input type="text" name="txt_empId"></td>
			</tr>
			<tr>
				<td><label>Employee Name:</label></td>
				<td><input type="text" name="txt_empName"></td>
			</tr>
			<tr>
				<td><label>Gender:</label></td>
				<td><input type="radio" name="rad_gender" value="Male">MALE
				<input type="radio" name="rad_gender" value="Female">FEMALE</td>
			</tr>
			<tr>
				<td><label>Employee Salary:</label></td>
				<td><input type="text" name="txt_basicSalary"></td>
			</tr>
			
			<tr>
				<td colspan ="2"><input type="submit" value="SUBMIT"></td>
			</tr>
		</form>

	</table>
</body>
</html>