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
<h2>Customers List</h2>
	<table border="1">
		<tr>
			<th>Customer Id</th>
			<th>Customer Name</th>
			<th>Customer Balance</th>
			<th>Email Id</th>
			<th>Phone Number</th>
		</tr>
		<c:forEach items="${requestScope.customers }" var="customer">
			<tr>
				<td><c:out value="${customer.id }"></c:out></td>
				<td><c:out value="${customer.name }"></c:out></td>
				<td><c:out value="${customer.balance }"></c:out></td>
				<td><c:out value="${customer.email }"></c:out></td>
				<td><c:out value="${customer.phone}"></c:out></td>
			</tr>

		</c:forEach>
		<tr>
			<td><a href="/">Back To Menu</a></td>
		</tr>
	</table>
</body>
<
</html>