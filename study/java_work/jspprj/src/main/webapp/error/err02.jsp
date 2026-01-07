<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="../excep/aaa.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>err02</title>
</head>
<body>
<h1>err02</h1>

<%

	int a = 10/0;
	out.println("정상실행");	
	//  errorPage="../excep/aaa.jsp"  에러 발생시 진입
	// 에러가 발생하지 않을 경우 진입하지 않음

%>


</body>
</html>