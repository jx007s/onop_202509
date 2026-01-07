<%@ page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>page</title>
</head>
<body>
<% 
	// page : Object 로 jsp 파일에서 객체 자신을 참조할 경우 사용
	HttpJspPage pp = (HttpJspPage)page;

	Enumeration en;
	
	en = this.getInitParameterNames();
	//en = page.getInitParameterNames();
	//en = pp.getInitParameterNames();
	en = pp.getServletConfig().getInitParameterNames();
	en = config.getInitParameterNames();
%>
page<br/>
<%=page %><br/>
<%=pp %><br/>
<%=this %><br/>
pp.getServletConfig()<br/>
<%=config %><br/>
<%=pp.getServletConfig() %><br/>
getServletInfo()<br/>
<%=this.getServletInfo() %><br/>
<%=pp.getServletInfo() %><br/>
<%-- <%=page.getServletInfo() %><br/> --%>
</body>
</html>
