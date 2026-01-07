<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>out</title>
</head>
<body>
<h1>out</h1>
<%
	JspWriter jw1 = out; 
	JspWriter jw2 = pageContext.getOut();
%>
<%=out %><br/>
<%=jw1 %><br/>
<%=jw2 %><br/>
<%=out.getBufferSize() %>, <%=out.getRemaining() %><br/>
나는무너 꿈을 꾸는 무너<br/>
<%=out.getBufferSize() %>, <%=out.getRemaining() %><br/>
<%="여긴 참나무숲 장수풍뎅이와 사슴벌레가 살지<br/>" %>
<%=out.getBufferSize() %>, <%=out.getRemaining() %><br/>
<%
	//out.clear();		//클라이언트에 보낼내용(버퍼)를 모두 지움--> 전송하지 않음
	out.flush(); 	//버퍼 내용을 전송후 버퍼 초기화
%>
<%=out.getBufferSize() %>, <%=out.getRemaining() %><br/>
</body>
</html>