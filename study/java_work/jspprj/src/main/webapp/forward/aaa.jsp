<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>aaa</title>
</head>
<body>
<h1>aaa</h1>
<%!
	int a = 10;
%>
<%
	String ff1 = "bbb.jsp";
	String ff2 = "mmm/ccc.jsp";
	
	int b = 20;
	request.setAttribute("now", new Date());
	request.setAttribute("mem", new LogMember("zxc","셋쇼마루","123"));
	request.setAttribute("arr", new int[]{11,22,33,44});
%>

aaa : <%=a %>,<%=b %>,<%=request.getParameter("pid") %><br/>
femwdpfjewgpf
efnwpojewopfjefw<br/>
fjnmweopfj0ewofn
nwefopwejnfopn

<!-- 최초 forward가 실행 -->
<jsp:forward page="bbb.jsp?pname=무잔">
	<jsp:param name="addr" value="지미집" />
	<jsp:param name="gender" value="f" /> 
</jsp:forward>
<jsp:forward page="ccc.jsp"/> <!-- 실행안함 -->
</body>
</html>