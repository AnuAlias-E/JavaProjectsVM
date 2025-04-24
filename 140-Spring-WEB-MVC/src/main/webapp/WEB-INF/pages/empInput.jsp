<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.err {
	color: red
}
</style>

</head>

<body>
	<h1>Employee Input Screen</h1>
	<form:form action="output" method="POST" modelAttribute="emp">
		<table>
			<tr>
				<td><label>ID :</label></td>
				<td><form:input path="id" /></td>
				<td><form:errors  path="id" cssClass="err" ></form:errors></td>
			</tr>
			<tr>
				<td><label>Name :</label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="err" ></form:errors></td>
			</tr>
			<tr>
				<td><label>Gender :</label></td>
				<td><form:select path="gender">
						<form:option value="MALE">MALE</form:option>
						<form:option value="FEMALE">FEMALE</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><label>City :</label></td>
				<td><form:input path="city" /></td>
				<td><form:errors path="city" cssClass="err" ></form:errors></td>
			</tr>
			<tr>
				<td><label>Basic :</label></td>
				<td><form:input path="basic" /></td>
				<td><form:errors path="basic" cssClass="err" ></form:errors></td>
			</tr>
			<tr>

				<td><input type="submit" value="Display" /></td>
			</tr>
		</table>

		<form:errors></form:errors>
	</form:form>
</body>
</html>