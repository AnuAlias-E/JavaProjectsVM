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
		<form action="SCS" method="POST">
		<tr>
				<td><label><h2>Enter Student Details</h2></label></td>
				</tr>
			<tr>
				<td><label>Student Roll Number:</label></td>
				<td><input type="text" name="txt_rollNo"></td>
			</tr>
			<tr>
				<td><label>Student Name:</label></td>
				<td><input type="text" name="txt_name"></td>
			</tr>
			<tr>
				<td><label>Gender:</label></td>
				<td><input type="radio" name="rad_gender" value="Male">MALE
				<input type="radio" name="rad_gender" value="Female">FEMALE</td>
			</tr>
			<tr>
				<td><label>Mark1:</label></td>
				<td><input type="text" name="txt_mark1"></td>
			</tr>
			<tr>
				<td><label>Mark2:</label></td>
				<td><input type="text" name="txt_mark2"></td>
			</tr>
			<tr>
				<td colspan ="2"><input type="submit" value="SUBMIT"></td>
			</tr>
		</form>

	</table>
</body>
</html>