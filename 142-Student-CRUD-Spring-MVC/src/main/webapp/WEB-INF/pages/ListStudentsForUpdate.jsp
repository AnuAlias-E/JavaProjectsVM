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

	<table border="1">
		<tr>
			<th>Roll Number</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Mark1</th>
			<th>Mark2</th>
			<th>Total</th>
			<th>Average</th>
		</tr>
		<c:forEach items="${requestScope.studs}" var="stud">
			<tr>
				<td><c:out value="${stud.rollNumber }"></c:out></td>
				<td><c:out value="${stud.name }"></c:out></td>
				<td><c:out value="${stud.gender }"></c:out></td>
				<td><c:out value="${stud.mark1 }"></c:out></td>
				<td><c:out value="${stud.mark2 }"></c:out></td>
				<td><c:out value="${stud.total }"></c:out></td>
				<td><c:out value="${stud.average }"></c:out></td>
				<td><a href="UpdateStudent2?txt_rollNumber=${pageScope.stud.rollNumber }">Modify</a></td>

			</tr>
		</c:forEach>
	</table>



</body>
</html>