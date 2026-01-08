<%@page import="basic_p.JoinMember"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JoinMember mem = (JoinMember)request.getAttribute("mem");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>joinReg</title>
</head>
<body>
<h1>joinReg</h1>

	<table border="">
		<tr>
			<td>이름</td>
			<td><%=mem.getPname()%></td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td><%=mem.getBirthStr()%></td>
		</tr>
		<tr>
			<td>주소</td>
			<td><%=mem.getAddr()%></td>
		</tr>
		<tr>
			<td>사진</td>
			<td>
			<img alt="" src="/jspprj/up/<%=mem.getMyPic()%>">
			</td>
		</tr>
		
	</table>

</body>
</html>