<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Input Screen</h1>
<form:form action="output" method="POST" modelAttribute="stud">
<table>
<tr>
<td><label>Roll Number :</label> </td>
<td><form:input path="rollNumber"/> </td>
</tr>
<tr>
<td><label>Name :</label> </td>
<td><form:input path="name"/> </td>
</tr>
<tr>
<td><label>Gender :</label> </td>
<td><form:select path="gender">
<form:option value="MALE">MALE</form:option>
<form:option value="FEMALE">FEMALE</form:option>
</form:select></td>
</tr>
<tr>
<td><label>Mark 1 :</label> </td>
<td><form:input path="mark1"/> </td>
</tr>
<tr>
<td><label>Mark 2 :</label> </td>
<td><form:input path="mark2"/> </td>
</tr>
<tr>

<td><input type="submit" value="Display"/> </td>
</tr>
</table>
</form:form>
</body>
</html>