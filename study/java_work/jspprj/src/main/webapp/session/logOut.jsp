<%@page import="basic_p.LogMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logOut</title>
</head>
<body>
<h1>logOut</h1>
<%
	
	LogMember mem = (LogMember)session.getAttribute("pid");
	session.invalidate();
%>

	<script type="text/javascript">
		alert("<%=mem.getPname() %>님 로그아웃되었습니다.")
		location.href="logMain.jsp";
	</script>
</body>
</html>