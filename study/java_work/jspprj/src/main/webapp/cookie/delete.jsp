<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키삭제</title>
</head>
<body>
	<h1>쿠키삭제</h1>
	<% 
		Cookie  coo3 = new Cookie("pid","");
		Cookie  coo4 = new Cookie("age","1234");
		Cookie  coo5 = new Cookie("pname","5678");
		
		coo3.setMaxAge(0);	//초단위
		coo4.setMaxAge(5);
		coo5.setMaxAge(10);
	
		response.addCookie(coo3);
		response.addCookie(coo4);
		response.addCookie(coo5);
	%>
	
	
	
</body>
</html>