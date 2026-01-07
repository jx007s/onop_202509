<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pagecontext</title>
</head>
<body>
<h1>pagecontext</h1>
<%
	PageContext pc = pageContext;
%>
pageContext<br/>
<%=pageContext %> <br/> 
<%=pc %><br/>
page<br/>
<%=pageContext.getPage() %> <br/> 
<%=page %><br/>
request<br/>
<%=pageContext.getRequest()%> <br/> 
<%=request%><br/>
response<br/>
<%=pageContext.getResponse() %> <br/> 
<%=response %><br/>
session<br/>
<%=pageContext.getSession() %> <br/> 
<%=session %><br/>
application<br/>
<%=pageContext.getServletContext() %> <br/> 
<%=application %><br/>
out<br/>
<%=pageContext.getOut() %> <br/> 
<%=out %><br/>
config<br/>
<%=pageContext.getServletConfig() %> <br/> 
<%=config %><br/>
exception<br/>
<%=pageContext.getException() %> <br/> 
<%=exception %><br/>
</body>
</html>