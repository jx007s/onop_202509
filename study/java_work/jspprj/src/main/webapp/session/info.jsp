<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보</title>
</head>
<body>
<h1>세션 정보</h1>
<%
	HttpSession ss1 = request.getSession();
	HttpSession ss2 = ((HttpServletRequest)pageContext.getRequest()).getSession();
	HttpSession ss3 = pageContext.getSession();
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>
session : <%=session %><br/>
ss1 : <%=ss1 %><br/>
ss2 : <%=ss2 %><br/>
ss3 : <%=ss3 %><br/>
getId: <%=session.getId() %><br/> <!-- JSESSIONID -->
CreationTime : <%=session.getCreationTime() %> , <%=sdf.format(session.getCreationTime()) %><br/>
LastAccessedTime : <%=session.getLastAccessedTime() %> , <%=sdf.format(session.getLastAccessedTime()) %><br/>
isNew : <%=session.isNew() %><br/>
MaxInactiveInterval : <%=session.getMaxInactiveInterval() %><br/>

</body>
</html>