<%@page import="db_p.ExamDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험목록</title>
</head>
<body>
<h1>시험목록</h1>
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
		<td><%=dto.getName() %></td>
		<td><%=dto.getPid() %></td>
		<td><%=dto.getRegDate() %></td>
		<td><%=dto.getKor() %></td>
		<td><%=dto.getEng() %></td>
		<td><%=dto.getMat() %></td>
	</tr>
	<% } %>
</table>

</body>
</html>