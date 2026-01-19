<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 reg1</title>
<style>
img{
	width:200px;
}
</style>
</head>
<body>
<h1>업로드완료 reg1</h1>
<h2>reg1</h2>
	<table border="">
		<tr>
			<td>이름</td>
			<td>${pname }</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${age }</td>
		</tr>
		<tr>
			<td>파일1</td>
			<td>${ff1 }</td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><img alt="" src="/fff/${ff2 }" /></td>
		</tr>
	</table>
</body>
</html>