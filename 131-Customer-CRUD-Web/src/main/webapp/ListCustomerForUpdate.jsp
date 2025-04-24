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
					<td><c:out value="${cust.Id }"></c:out></td>
					<td><c:out value="${cust.name }"></c:out></td>
					<td><c:out value="${cust.balance }"></c:out></td>
					<td><c:out value="${cust.email }"></c:out></td>
					<td><c:out value="${cust.phoneNo }"></c:out></td>
					<td><a href="UpdateCustomer2?txt_customerId=${pageScope.cust.customerId}">Modify</a></td>
					
					
					
				</tr>

			</c:forEach>

		</table>
</body>
</html>