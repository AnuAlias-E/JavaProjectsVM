<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	<form action="UpdateCustomer3" method="post">
		<table>
			<tr>
				<td><label><h2>Update customer Details</h2></label></td>
			</tr>
			<tr>
				<td><label>Customer Id :</label></td>
				<td><input type="text" name="txt_customerId"
					value="${requestScope.customer.id}"></td>
			</tr>
			<tr>
				<td><label>Customer Name :</label></td>
				<td><input type="text" name="txt_name"
					value="${requestScope.customer.name}"></td>
			</tr>
		

<tr>
				<td><label>Customer Balance :</label></td>
				<td><input type="text" name="txt_balance"
					value="${requestScope.customer.balance}"></td>
			</tr>
			<tr>
				<td><label>Email Id :</label></td>
				<td><input type="text" name="txt_email"
					value="${requestScope.customer.email}"></td>
			</tr>
			<tr>
				<td><label>Phone Number :</label></td>
				<td><input type="text" name="txt_Phone"
					value="${requestScope.customer.phoneNo}"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="UPDATE"></td>
			</tr>

		</table>
	</form>
</body>
</html>