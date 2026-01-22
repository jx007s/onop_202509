<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spFrm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>유효성검사</h1>
<form method="post">
<table>
	<tr>
		<td>id</td>
		<td><input type="text" name="pid" />
			<br/>
			<spFrm:errors path="person.pid"/>
		</td>
	</tr>
	<tr>
		<td>pw</td>
		<td><input type="text" name="pw" />
		<br/>
			<spFrm:errors path="person.pw"/>
		</td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="로그인" /></td>
	</tr>
</table>
</form>
</body>
</html>