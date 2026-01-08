<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinForm</title>
</head>
<body>
<h1>joinForm</h1>
<form action="/jspprj/JoinReg" method="post" enctype="multipart/form-data">
	<table border="">
		<tr>
			<td>이름</td>
			<td><input type="text" name="pname" /></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><input type="date" name="birth" /></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><input type="text" name="addr" /></td>
		</tr>
		<tr>
			<td>사진</td>
			<td><input type="file" name="myPic" /></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="작성" /></td>
		</tr>
	</table>
</form>
</body>
</html>