
<%@page import="aaa.model.ExamDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험Sch</title>
</head>
<body>
<h1>시험Sch</h1>
<%
	ArrayList<ExamDTO> mainData =(ArrayList<ExamDTO>)request.getAttribute("mainData");
	//out.println(mainData);
%>
<table border="">
	<tr>
		<td>학기</td>
		<td>시험</td>
		<td>학생ID</td>
		<td>시험일</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
	</tr>
	<% for(ExamDTO dto : mainData) {%>
	<tr>
		<td><%=dto.getHakgi() %></td>
		<td><a href="/exam/examDetail/<%=dto.getId() %>"><%=dto.getName() %></a></td>
		<td><%=dto.getPid() %></td>
		<td><%=dto.getRegDate() %></td>
		<td><%=dto.getKor() %></td>
		<td><%=dto.getEng() %></td>
		<td><%=dto.getMat() %></td>
	</tr>
	<% } %>
	
	<tr>
		<td colspan="7" align="right">
			<a href="/exam/examInsertForm">쓰기</a>
		</td>	
	</tr>
</table>

</body>
</html>