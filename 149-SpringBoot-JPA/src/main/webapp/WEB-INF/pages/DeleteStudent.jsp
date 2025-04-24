<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="DeleteStudent3" method="post" modelAttribute="stud">
		<table>
			<tr>
				<td><label><h2>Delete Student Details</h2></label></td>
			</tr>
			<tr>
				<td><label>Student Roll Number :</label></td>
				<td><form:input path="rollNumber"/></td>
			</tr>
			<tr>
				<td><label>Student Name :</label></td>
				<td><form:input path="name"/></td>
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
				<td colspan="2"><input type="submit" value="DELETE"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>