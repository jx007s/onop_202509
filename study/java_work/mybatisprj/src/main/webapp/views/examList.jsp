
<%@page import="aaa.di.PageInfo"%>
<%@page import="aaa.model.ExamDTO"%>
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
	
	PageInfo pInfo =(PageInfo)request.getAttribute("pageInfo");
%>
${pageInfo }
<h3>examSch</h3>
<a href="/exam/examSch?schTitle1=name&schVal1=semi&schTitle2=hakgi&schVal2=1&schTitle3=pid&schVal3=b">검색123</a>
<a href="/exam/examSch?schTitle1=name&schVal1=semi&schTitle2=hakgi&schVal2=1">검색12</a>
<a href="/exam/examSch?schTitle1=name&schVal1=semi">검색1</a>
<a href="/exam/examSch?schTitle2=hakgi&schVal2=1">검색2</a>
<a href="/exam/examSch">검색없음</a>
<h3>examChoose</h3>
<a href="/exam/examChoose?schTitle1=1">1</a>
<a href="/exam/examChoose?schTitle1=2">2</a>
<a href="/exam/examChoose?schTitle1=3">3</a>
<a href="/exam/examChoose">선택없음</a>
<table border="">
	<tr>
		<td colspan="8">
		
			<form action="examSch">
				<select name="schTitle1" >
					<option value="hakgi">학기</option>
					<option value="name">시험</option>
					<option value="pid">학생</option>
				</select>
				<input type="text" name="schVal1" />
				<input type="submit" value="검색" />
			</form>
		
		</td>
	</tr>
	<tr>
		<td>번호</td>
		<td>학기</td>
		<td>시험</td>
		<td>학생ID</td>
		<td>시험일</td>
		<td>국어</td>
		<td>영어</td>
		<td>수학</td>
	</tr>
	<% 
	int k = 0;
	for(ExamDTO dto : mainData) {
		k++;
	%>
	<tr>
		<td><%=pInfo.getStart()+k %></td>
		<td><%=dto.getHakgi() %></td>
		<td><a href="/exam/examDetail/${pageInfo.getPNo()}/<%=dto.getId() %>"><%=dto.getName() %></a></td>
		<td><%=dto.getPid() %></td>
		<td><%=dto.getRegDate() %></td>
		<td><%=dto.getKor() %></td>
		<td><%=dto.getEng() %></td>
		<td><%=dto.getMat() %></td>
	</tr>
	<% } %>
	
	<tr>
		<td colspan="8" align="center">
			<% if(pInfo.getPStart()>1) { %>
				<a href="/exam/examList/<%=pInfo.getPStart()-1 %>">[이전]</a>
			<%}
				for(int i = pInfo.getPStart(); i <= pInfo.getPEnd(); i++){	
					if(pInfo.getPNo()==i){
			%>[<%=i %>]
			<%} else { %>
				<a href="/exam/examList/<%=i %>"><%=i %></a>
			<% }} 
			if(pInfo.getPEnd() < pInfo.getPTotal()) {%>
				<a href="/exam/examList/<%=pInfo.getPEnd()+1 %>">[다음]</a>
			<%} %>
		</td>	
	</tr>
	
	<tr>
		<td colspan="8" align="right">
			<a href="/exam/examInsertForm/${pageInfo.getPNo()}">쓰기</a>
			<a href="/exam/examInsertList/${pageInfo.getPNo()}">다중쓰기</a>
		</td>	
	</tr>
</table>

</body>
</html>
