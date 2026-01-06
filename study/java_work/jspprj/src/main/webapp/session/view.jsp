<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view</title>
</head>
<body>
	<h1>view</h1>
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
%>		
session과 application 정보만 확인 가능 <br/>	
ss_id  : 	<%=session.getAttribute("ss_id")%><br/>
ss_age : 	<%=session.getAttribute("ss_age")%><br/>
ss_arr : 	<%=session.getAttribute("ss_arr")%><br/>
	
rr_id  : 	<%=request.getAttribute("rr_id")%><br/>
rr_age : 	<%=request.getAttribute("rr_age")%><br/>
		
aa_id  : 	<%=application.getAttribute("aa_id")%><br/>
aa_age : 	<%=application.getAttribute("aa_age")%><br/>

pa_id  : 	<%=pageContext.getAttribute("pa_id")%><br/>
pa_age : 	<%=pageContext.getAttribute("pa_age")%><br/>

<hr/>
getId: <%=session.getId() %><br/>
<%
	// attribute 이름들
	Enumeration<String> attrNames = session.getAttributeNames();

	while(attrNames.hasMoreElements()){
	String an = attrNames.nextElement(); 
%>
<%=an %> : <%=session.getAttribute(an) %> <br/>
<%} %>
	
</body>
</html>