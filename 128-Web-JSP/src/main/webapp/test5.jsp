<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="stud" class="com.training.model.Student" scope="request"></jsp:useBean>
	<jsp:setProperty property="rollNo" name="stud" param="txt_rollNumber" />
	<jsp:setProperty property="name" name="stud" param="txt_name" />
	<jsp:setProperty property="gender" name="stud" param="rad_gender" />
	<jsp:setProperty property="mark1" name="stud" param="txt_mark1" />
	<jsp:setProperty property="mark2" name="stud" param="txt_mark2" />
	<jsp:forward page="test7.jsp"></jsp:forward>

</body>
</html>