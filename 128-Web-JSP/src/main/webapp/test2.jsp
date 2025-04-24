<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!int empId;
	String empName;
	double basic;

	double getAllowance() {
		return this.basic * 0.35;
	}%>

	<%
	this.empId = 101;
	this.empName = "Renju";
	this.basic = 10000.00;
	%>
	<h1>
		Allowance
		<%=this.getAllowance()%>
	</h1>
</body>
</html>