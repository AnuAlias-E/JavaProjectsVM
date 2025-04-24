<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.Date,java.util.ArrayList" %>
    <%@page import="java.util.TreeSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="hello.txt" %>
<br>
<%@include file="today.jsp" %>

<br>
<%=new Date() %>
<br>
<% TreeSet<String> cities= new TreeSet();
cities.add("Delhi");
cities.add("Cochin");
cities.add("TVM");
%>
<%=cities %>
</body>
</html>