<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회사입니다.</title>
</head>
<body>
<h1>회사입니다.</h1>
<table border="">
	<tr>
		<td><jsp:include page="inc/header.jsp"/></td>
	</tr>
	<tr>
		<td><jsp:include page="main/${mainUrl }.jsp"/></td>
	</tr>
	<tr>
		<td><jsp:include page="inc/footer.jsp"/></td>
	</tr>
</table>
</body>
</html>