<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.err {
	color: red
}
</style>
</head>

<body>
	<form:form action="UpdateCustomer3" method="post" modelAttribute="cust">
		<table>
			<tr>
				<td><label><h2>Update customer Details</h2></label></td>
			</tr>
			<tr>
				<td><label>Customer Id :</label></td>
				<td><form:input path="id" readonly="readonly"  /></td>
			</tr>
			<tr>
				<td><label>Customer Name :</label></td>
				<td><form:input path="name" /></td>
				<td><form:errors path="name" cssClass="err"></form:errors></td>
			</tr>


			<tr>
				<td><label>Customer Balance :</label></td>
				<td><form:input path="balance" /></td>
				<td><form:errors path="balance" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<td><label>Email Id :</label></td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<td><label>Phone Number :</label></td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="err"></form:errors></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="UPDATE"></td>
			</tr>
			<tr>
				<td><a href="/">Back To Menu</a></td>
			</tr>
		</table>
	</form:form>
</body>
</html>