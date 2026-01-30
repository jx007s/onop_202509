<%@page import="aaa.model.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시험상세</title>
</head>
<body>
<h1>시험상세</h1>
<%
	ExamDTO dto =(ExamDTO)request.getAttribute("mainData");
	//out.println(mainData);
%>
<table border="">
	<tr>
		<td>학기</td><td><%=dto.getHakgi() %></td>
	</tr><tr>
		<td>시험</td><td><%=dto.getName() %></td>
	</tr><tr>
		<td>학생ID</td><td><%=dto.getPid() %></td>
	</tr><tr>
		<td>시험일</td><td><%=dto.getRegDate() %></td>
	</tr><tr>
		<td>국어</td><td><%=dto.getKor() %></td>
	</tr><tr>
		<td>영어</td><td><%=dto.getEng() %></td>
	</tr><tr>
		<td>수학</td><td><%=dto.getMat() %></td>
	</tr><tr>
		<td>파일</td><td><%=dto.getFf() %></td>
	</tr><tr>
		<td colspan="2" align="right">
			<a href="/exam/examList/${pageInfo.getPNo()}">목록으로</a>
			<a href="/exam/examDelete/${pageInfo.getPNo()}/<%=dto.getId()%>">삭제</a>
			<a href="/exam/examModifyForm/${pageInfo.getPNo()}/<%=dto.getId()%>">수정</a>
		</td>
	</tr>
</table>

</body>
</html>