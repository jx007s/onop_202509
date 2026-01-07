<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="../excep/aaa.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>err01</title>
</head>
<body>
<h1>err01</h1>

<%
	try{
		int a = 10/0;
		out.println("정상실행");	
	}catch(Exception e){
		out.println("catch 실행:"+e.getMessage());
	}

	/*
	exception 우선순위
	1. try~catch
	2. errorPage 지정
	3. web.xml : exception-type 지정
	4. web.xml : error-code 지정
	5. tomcat 컨테이너 처리
	
	*/

%>


</body>
</html>