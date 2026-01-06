<%@page import="java.util.Map"%>
<%@page import="basic_p.ReqStud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ReqStud st = new ReqStud(request);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examForm</title>
</head>
<body>
	<h1>examReg</h1>
	<table border="">
		<tr>
			<td>이름</td>
			<td><%=st.getPname() %></td>
		</tr>
		<% for(Map.Entry<String, Integer> mm : st.getJum().entrySet()) {%>
		<tr>
			<td><%=mm.getKey() %></td>
			<td><%=mm.getValue() %></td>
		</tr>
		<%} %>
		<tr>
			<td>총점</td>
			<td><%=st.getTot() %></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%=st.getAvg() %></td>
		</tr>
	</table>
		
</body>
</html>