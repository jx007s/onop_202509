<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileDir</title>
</head>
<body>
	<h1>fileDir</h1>
	<%
		String dir = request.getServletContext().getRealPath("fff");
		for(File ff : new File(dir).listFiles()){
			if(ff.isFile()){
	%>
	<a href="/jspprj/FFFDown?fName=<%=ff.getName() %>"><%=ff.getName() %></a><br/>
	
	<%}} %>
</body>
</html>