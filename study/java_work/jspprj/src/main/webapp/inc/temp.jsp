<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

	String service = "info";

	if(request.getParameter("service")!=null){
		service = request.getParameter("service");
	}

	String mainUrl = "main/"+service+".jsp";
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>temp</title>
</head>
<body>
<h1>temp</h1>
<table border="">
	<tr>
		<td>
		<jsp:include page="top.jsp"/>
		</td>
	</tr>
	<tr>
		<td>
		<jsp:include page="<%=mainUrl %>"/>
		</td>
	</tr>
	<tr>
		<td>
		<jsp:include page="bottom.jsp"/>
		</td>
	</tr>
</table>
</body>
</html>