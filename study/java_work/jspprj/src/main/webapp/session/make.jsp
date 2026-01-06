<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>make</title>
</head>
<body>
	<h1>make</h1>
<%
/*
	 scope 내장객체 -    page,     request, session, application
	       속성설정 - pageContext, request, session, application
	
	
	
 영역			영역객체       	속성의 유효 범위
page    		pageContext    	해당 페이지가 클라이언트에 서비스를 제공하는 동안에만 유효합니다.
                          	(서블릿 인스턴스의 _jspService() 메소드가 실행되는 동안에만 유효합니다.)

request    	request			클라이언트 요청이 처리되는 동안 유효합니다.
		 					(forwarding, include를 이용하여 여러 페이지에 공유할 수 있습니다.

session		session			세션이 유지되는 동안 유효합니다.
							(하나의 브라우저에 1개의 세션이 생성되므로 같은 웹 브라우저 내에서 실행되는 페이지들이 속성을 공유할 수 있습니다.)

application	application		웹 어플리케이션이 실행되고 있는 동안에 유효합니다.
							(웹 컨테이너에서 해당 어플리케이션은 오직 하나만 실행되므로 4자기 영역 중 가장 큰 영역에 해당합니다.)
	
*/
	
	
	session.setAttribute("ss_id", "aaa");
	session.setAttribute("ss_age", 32);
	session.setAttribute("ss_arr", new int[] {11,22,33});
	
	//page.setAttribute("pp_id", "bbb");
	request.setAttribute("rr_id", "ccc");
	request.setAttribute("rr_age", 27);
	
	//response.setAttribute("re_id", "ddd");
	
	application.setAttribute("aa_id", "eee");
	application.setAttribute("aa_age", 23);
	
	pageContext.setAttribute("pa_id", "fff");
	pageContext.setAttribute("pa_age", 19);
%>	
	
	
</body>
</html>