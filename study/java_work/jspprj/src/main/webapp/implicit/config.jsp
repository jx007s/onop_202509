<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>config</title>
</head>
<body>
<h1>config</h1>
<%
	ServletConfig sc1 = config;
	ServletConfig sc2 = pageContext.getServletConfig();
	ServletContext context1 = config.getServletContext();
	ServletContext context2 = application;
	
%>
<%=config %><br/>
<%=sc1 %><br/>
<%=sc2 %><br/>
<%=config.getServletName() %><br/>
<%=config.getInitParameterNames() %><br/>
<%=context1 %><br/>
<%=context2 %><br/>
<%
	Enumeration en = config.getInitParameterNames();
	while(en.hasMoreElements()){
		out.println(en.nextElement()+"<br/>");
	}
%>
<%=config.getInitParameter("fork") %><br/>
<%=config.getInitParameter("xpoweredBy") %><br/>
</body>
</html>