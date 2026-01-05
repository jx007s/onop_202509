<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	Map<String, String> gender = Map.of(
			"m", "남자",
			"f", "여자"
	);

String [] hoArr = request.getParameterValues("hobby"); %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinReg</title>
</head>
<body>
<table border="">
	<tr>
		<td>id</td>
		<td><%=request.getParameter("pid") %></td>
	</tr>
	<tr>
		<td>이름</td>
		<td><%=request.getParameter("pname") %></td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><%=request.getParameter("email1") %>@
			<%=request.getParameter("email2") %>
		</td>
	</tr>
	<tr>
		<td>성별</td>
		<td><%=gender.get( request.getParameter("gender")) %>	</td>
	</tr>
	<tr>
		<td>취미</td>
		
		<td><%=Arrays.toString(hoArr) %></td>
	</tr>
</table>
</body>
</html>

<!-- 

examForm.jsp -> examReg.jsp
학생 1명의 
이름, 국어, 영어, 수학 점수를 입력받아
이름, 국어, 영어, 수학 , 총점, 평균 을 출력하세요

 -->

