<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<td><label>Roll Number</label></td>
				<td><input type="text" name="txt_rollNumber"
					value="${requestScope.stud.rollNumber}"></td>
			</tr>
			<tr>
				<td><label>Name</label></td>
				<td><input type="text" name="txt_name"
					value="${requestScope.stud.name}"></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><input type="radio" name="rad_gender" value="Male">MALE
					<input type="radio" name="rad_gender" value="Female">FEMALE
				</td>
			</tr>

			<%--  	<c:choose>
				<c:when test="${requestScope.stud.gender=='M'}">
					<tr>
						<td><label>Gender</label></td>
						<td><input type="radio" name="rad_gender" value="Male" checked="checked">MALE
							<input type="radio" name="rad_gender" value="Female">FEMALE
						</td>
					</tr>
				</c:when>
				<c:when test="${requestScope.stud.gender=='F'}">
					<tr>
						<td><label>Gender</label></td>
						<td><input type="radio" name="rad_gender" value="Male">MALE
							<input type="radio" name="rad_gender" value="Female" checked="checked">FEMALE
						</td>
					</tr>
				</c:when>

			</c:choose> --%>
			
			<tr>
				<td><label>Mark1</label></td>
				<td><input type="text" name="txt_mark1"
					value="${requestScope.stud.mark1}"></td>
			</tr>
			<tr>
				<td><label>Mark2</label></td>
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