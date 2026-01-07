<%@page import="java.io.InputStream"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application</title>
</head>
<body>
<h1>application</h1>
<%=application %><br/>
<%=application.getServletContextName() %><br/>
<%=application.getContextPath() %><br/>
<%=application.getServerInfo() %><br/>
<%=application.getMajorVersion() %><br/>
<%=application.getMinorVersion() %><br/>
<!--   경로 위치 기준 : 프로젝트 webapp  -->
<%=application.getRealPath("fff/aaa.jpg") %><br/>
<%-- <%=request.getRealPath("fff/aaa.jpg") %><br/> --%>
<%=request.getServletContext().getRealPath("fff/aaa.jpg") %><br/>
<%
	//URL url = application.getResource("fff/exam.txt");
	URL url = request.getServletContext().getResource("fff/exam.txt");
	InputStream iis = url.openStream();
	byte [] buf = new byte[iis.available()];
	iis.read(buf);
	iis.close();
%>
<%=url %><br/>
<%=new String(buf) %><br/>
</body>
</html>