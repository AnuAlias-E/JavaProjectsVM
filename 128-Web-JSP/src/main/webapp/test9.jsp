<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="employee" class="com.training.model.Employee" scope="request"></jsp:useBean>
	<jsp:setProperty property="id" name="employee" param="txt_empId" />
	<jsp:setProperty property="name" name="employee" param="txt_empName" />
	<jsp:setProperty property="gender" name="employee" param="rad_gender" />
	<jsp:setProperty property="basicSalary" name="employee" param="txt_basicSalary" />
	<jsp:forward page="test11.jsp"></jsp:forward>
</body>
</html>