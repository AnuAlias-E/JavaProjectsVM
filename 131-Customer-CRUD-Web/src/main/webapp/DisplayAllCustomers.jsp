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
				<th>Customer Id</th>
				<th>Customer Name</th>
				<th>Customer Balance</th>
				<th>Email Id</th>
				<th>Phone Number</th>
			</tr>
			<c:forEach items="${requestScope.customers }" var="customer">
				<tr>
					<td><c:out value="${customer.customerId }"></c:out></td>
					<td><c:out value="${customer.name }"></c:out></td>
					<td><c:out value="${customer.balance }"></c:out></td>
					<td><c:out value="${customer.email }"></c:out></td>
					<td><c:out value="${customer.phoneNo }"></c:out></td>
				</tr>

			</c:forEach>

		</table>
</body>
</html>