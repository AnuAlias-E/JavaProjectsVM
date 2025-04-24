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
<h2>Customer List</h2>
	<table border="1">
		<tr>
			<th>Customer Id</th>
			<th>Name</th>
			<th>Balance</th>
			<th>Email</th>
			<th>Phone Number</th>
		</tr>
		<c:forEach items="${requestScope.customer }" var="cust">
			<tr>
				<td><c:out value="${cust.id }"></c:out></td>
				<td><c:out value="${cust.name }"></c:out></td>
				<td><c:out value="${cust.balance }"></c:out></td>
				<td><c:out value="${cust.email }"></c:out></td>
				<td><c:out value="${cust.phone }"></c:out></td>
				<td><a
					href="UpdateCustomer2?txt_customerId=${pageScope.cust.id}">Modify</a></td>



			</tr>

		</c:forEach>
		<tr>
			<td><a href="/">Back To Menu</a></td>
		</tr>
	</table>
</body>
</html>