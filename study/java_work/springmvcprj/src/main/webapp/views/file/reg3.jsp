<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파일 reg3</title>
<style>
img{
	width:200px;
}
</style>
</head>
<body>
<h1>업로드완료 reg3</h1>
<h2>reg3</h2>
	<table border="">
		<tr>
			<td>이름</td>
			<td>${fileData.pname }</td>
		</tr>
		<tr>
			<td>나이</td>
			<td>${fileData.age }</td>
		</tr>
		<tr>
			<td>파일1</td>
			<td>${fileData.ff1 }</td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><img alt="" src="/fff/${fileData.ff2.originalFilename }" /></td>
		</tr>
	</table>
</body>
</html>