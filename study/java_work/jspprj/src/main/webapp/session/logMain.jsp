<%@page import="basic_p.LogMember"%>
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
	LogMember mem = (LogMember)session.getAttribute("pid");
	if(mem==null){%>
		
	<form action="logReg.jsp">
	id <input type="text" name="pid" />
	pw <input type="text" name="pw" />
	 <input type="submit" value="로그인" />
	</form>	
		
<%}else{
	%>
	<%=mem.getPname() %>님 안녕하세요 <a href="logOut.jsp">로그아웃</a>
<%}%>


</body>
</html>