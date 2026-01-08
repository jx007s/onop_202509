<%@page import="java.util.Arrays"%>
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bbb</title>
</head>
<body>
<h1>bbb</h1>
<%
	int b = 200;
	Date now = (Date)request.getAttribute("now");
	LogMember mem = (LogMember)request.getAttribute("mem");
	int [] arr =  (int [])request.getAttribute("arr");
%>

<%=b %>,
<%=request.getParameter("pname") %>,
<%=request.getParameter("addr") %>,
<%=request.getParameter("gender") %>,
<%=request.getParameter("pid") %>,<br/>
<%=now.getDay()%><br/>
<%=mem%><br/>
<%=Arrays.toString(arr)%><br/>



<img src="../fff/family16.JPG" alt="" />
</body>
</html>