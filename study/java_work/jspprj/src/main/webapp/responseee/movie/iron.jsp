<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이언맨</title>
<style type="text/css">
img{
	width:200px;
}
</style>
</head>
<body>
	<h1>아이언맨</h1>
	<img alt="" src="/jspprj/fff/family1.JPG">
	<div>
	인원수 : <%=request.getParameter("cnt") %>
	</div>
	
</body>
</html>