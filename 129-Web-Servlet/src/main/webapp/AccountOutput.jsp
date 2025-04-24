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
	<table>

		<tr>
			<td>Account Id :</td>
			<td><c:out value="${requestScope.acc.id }"></c:out></td>
		</tr>
		<tr>
			<td>Account Holder Name :</td>
			<td><c:out value="${requestScope.acc.accountHolderName }"></c:out></td>
		</tr>

		<tr>
			<td>Account Balance :</td>
			<td><c:out value="${requestScope.acc.balance }"></c:out></td>
		</tr>

		<tr>
			<td>Account Type :</td>
			<td><c:out value="${requestScope.acc.typeOfAccount }"></c:out></td>
		</tr>
	</table>
</body>
</html>