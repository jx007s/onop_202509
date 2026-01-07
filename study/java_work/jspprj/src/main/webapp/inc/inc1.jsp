
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>inc1</title>
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

<style type="text/css">
img{
	width:300px;
}
</style>

</head>
<body>
<h1>inc1</h1>
inc1 : <%=a %>,<%=b %>,<%=request.getParameter("pid") %><br/>
<jsp:include page="aaa.jsp?pname=이누야샤">
<jsp:param name="addr" value="니네집" />
<jsp:param name="gender" value="m" />
</jsp:include>
<br/>
<%-- inc1 : <%=b %>,<%=c %><br/> --%>
<jsp:include page="<%=ff1 %>"/>
<jsp:include page="<%=ff2 %>"/>
<br/>
</body>
</html>