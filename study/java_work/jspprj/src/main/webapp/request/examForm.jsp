<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examForm</title>
</head>
<body>
	<h1>examForm</h1>
	<form action="examReg.jsp" method="post">
		<fieldset><label for="">이름</label><input type="text" name="pname" /></fieldset>
		<fieldset><label for="">국어</label><input type="number" name="kor" /></fieldset>
		<fieldset><label for="">영어</label><input type="number" name="eng" /></fieldset>
		<fieldset><label for="">수학</label><input type="number" name="mat" /></fieldset>
		<fieldset><input type="submit" value="등록" /></fieldset>
	</form>
</body>
</html>