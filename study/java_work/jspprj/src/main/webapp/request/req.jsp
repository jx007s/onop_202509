<%@page import="java.util.Arrays"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request</title>
</head>
<body>
	<h1>request</h1>
	<%
		HttpServletRequest reqq1 = request;
		ServletRequest reqq2 = pageContext.getRequest();
	
		out.println(request+"<br/>");	
		out.println(reqq1+"<br/>");
		out.println(reqq2+"<br/>");
		
		out.println(request.getRemoteAddr()+"<br/>");
		out.println(request.getRemoteHost()+"<br/>");
		out.println(request.getRemoteUser()+"<br/>");
		out.println(request.getProtocol()+"<br/>");
		out.println(request.getServerName()+"<br/>");
		
		out.println(request.getMethod()+"<br/>");
		out.println(request.getContentType()+"<br/>");
		out.println(request.getContentLength()+"<br/>");
		out.println(request.getRequestURL()+"<br/>");
		out.println(request.getRequestURI()+"<br/>");
		out.println(request.getContextPath()+"<br/>");
		out.println(request.getCharacterEncoding()+"<br/>");
		out.println(request.getHeader("referer")+"<br/>");
		out.println(request.getHeader("User-Agent")+"<br/>");
		
		String enTTT = URLEncoder.encode("붉은말", "UTF-8");
		System.out.println(enTTT); // %EB%B6%89 %EC%9D%80 %EB%A7%90
		
		
		out.println("<hr/>");
		
		Enumeration<String> en = request.getParameterNames();
		while(en.hasMoreElements()){
			out.println(en.nextElement()+"<br/>");
		}
		out.println(request.getParameter("no")+"<br/>");
		out.println(request.getParameter("pname")+"<br/>");
		out.println(request.getParameter("marriage")+"<br/>");
		out.println(request.getParameter("hobby")+"<br/>");
		String [] hobbys = request.getParameterValues("hobby");
		out.println(Arrays.toString(hobbys)+"<br/>");
		
		
	%>
</body>
</html>