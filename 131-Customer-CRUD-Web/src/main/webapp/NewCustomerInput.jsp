<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<H1>Add New Customer</H1>
<table>
		<form action="AddCustomer2" method="post">
		<tr>
				<td><label><h2>Enter Customer Details</h2></label></td>
				</tr>
			<tr>
				<td><label>Customer ID :</label></td>
				<td><input type="text" name="txt_id"></td>
			</tr>
			<tr>
				<td><label>Customer Name :</label></td>
				<td><input type="text" name="txt_name"></td>
			</tr>
			
			<tr>
				<td><label>Customer Balance :</label></td>
				<td><input type="text" name="txt_balance"></td>
			</tr>
			<tr>
				<td><label>Email Id:</label></td>
				<td><input type="text" name="txt_email"></td>
			</tr>
			<tr>
				<td><label>Phone Number:</label></td>
				<td><input type="text" name="txt_phoneNo"></td>
			</tr>
			
			<tr>
				<td colspan ="2"><input type="submit" value="SUBMIT"></td>
			</tr>
		</form>

	</table>
</body>
</html>