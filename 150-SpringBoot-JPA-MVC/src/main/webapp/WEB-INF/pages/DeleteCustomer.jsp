<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Customer Need to be Delete</h2>
	<form:form action="DeleteCustomer3" method="post" modelAttribute="cust">
		<table>
			<tr>
				<td><label><h2>Delete Customer Details</h2></label></td>
			</tr>
			<tr>
				<td><label>Customer ID:</label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><label>Customer Name :</label></td>
				<td><form:input path="name" /></td>
			</tr>




			<tr>
				<td><label>Email ID :</label></td>
				<td><form:input path="email" /></td>
			</tr>
			<tr>
				<td><label>Phone Number :</label></td>
				<td><form:input path="phone" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="DELETE"></td>
			</tr>
			<tr>
				<td><a href="/">Back To Menu</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>