<%@page import="aaa.mmm.Stud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examReg</title>
<%
	Stud st = (Stud)request.getAttribute("stud");
%>
</head>
<body>
<h1>examReg</h1>
	
	<table border="">
		<tr>
			<td>이름</td>
			<td><%=st.getPname()%></td>
		</tr>
		<tr>
			<td>국어</td>
			<td><%=st.getKor()%></td>
		</tr>
		<tr>
			<td>영어</td>
			<td><%=st.getEng()%></td>
		</tr>
		<tr>
			<td>수학</td>
			<td><%=st.getMat()%></td>
		</tr>
		<tr>
			<td>총점</td>
			<td><%=st.getTot()%></td>
		</tr>
		<tr>
			<td>평균</td>
			<td><%=st.getAvg()%></td>
		</tr>
	</table>

</body>
</html>