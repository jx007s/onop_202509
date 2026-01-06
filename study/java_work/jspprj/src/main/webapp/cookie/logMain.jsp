<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logMain.jsp</title>
</head>
<body>
<h1>logMain</h1>
<%
	String pid = Arrays.stream(request.getCookies())
				.filter(coo->"pid".equals(coo.getName()))
				.map(Cookie::getValue)
				.findFirst()
				.orElse(null);

	if(pid==null){%>
		
	<form action="logReg.jsp">
	id <input type="text" name="pid" />
	pw <input type="text" name="pw" />
	 <input type="submit" value="로그인" />
	</form>	
		
<%}else{ %>
	<a href="logOut.jsp">로그아웃</a>
<%}%>


</body>
</html>