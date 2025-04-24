<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="DeleteStudent3" method="post">
		<table>
			<tr>
				<td><label><h2>Delete Student Details</h2></label></td>
			</tr>
			<tr>
				<td><label>Student Roll Number :</label></td>
				<td><input type="text" name="txt_rollNo"
					value="${requestScope.stud.rollNumber}"></td>
			</tr>
			<tr>
				<td><label>Student Name :</label></td>
				<td><input type="text" name="txt_name"
					value="${requestScope.stud.name}"></td>
			</tr>
		

<tr>
				<td><label>Gender :</label></td>
				<td><input type="radio" name="rad_gender" value="Male">MALE
				<input type="radio" name="rad_gender" value="Female">FEMALE</td>
			</tr>

			<tr>
				<td><label>Mark 1 :</label></td>
				<td><input type="text" name="txt_mark1"
					value="${requestScope.stud.mark1}"></td>
			</tr>
			<tr>
				<td><label>Mark 2 :</label></td>
				<td><input type="text" name="txt_mark2"
					value="${requestScope.stud.mark2}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="DELETE"></td>
			</tr>

		</table>
	</form>
</body>
</html>