<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>a</title>
</head>
<body>
	<h1>a</h1>
	<%
		HttpServletResponse res1 = response;
		ServletResponse res2 = pageContext.getResponse();	
		PrintWriter out1 = response.getWriter();	//html 에 작성
		//ServletOutputStream sos = response.getOutputStream(); // 파일 다운로드 할때 사용할 stream
		
		System.out.println(response);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(out);
		System.out.println(out1);
		out.println("아기상어");
		out1.println("엄마상어");
		response.setContentType("text/html; charset=UTF-8");
		System.out.println(response.getHeader("Content-Type"));
		//response.sendError(404);  에러전송  실제 에러남
		//response.sendError(500,"오류오류");  //에러전송  실제 에러남
		//response.setStatus(200);
		//response.setStatus(HttpServletResponse.SC_OK);  //200
		//response.setStatus(404);  //404  --실제 에러가 아닌 status_code 만 404로 전달
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);  //404
	%>
	
</body>
</html>