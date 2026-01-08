<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>upload</title>
</head>
<body>
<h1>upload</h1>
<form action="/jspprj/UpReg" enctype="multipart/form-data" method="post">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" /></td>
		</tr>
		<tr>
			<td>파일1</td>
			<td><input type="file" name="ff1" multiple /></td>
		</tr>
		<tr>
			<td>파일2</td>
			<td><input type="file" name="ff2"  multiple /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="등록" />
			</td>
		</tr>
	</table>
</form>
</body>
</html>