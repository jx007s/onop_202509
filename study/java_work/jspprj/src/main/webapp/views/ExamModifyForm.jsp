<%@page import="db_p.ExamDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ExamDTO dto =(ExamDTO)request.getAttribute("mainData");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정</title>
</head>
<body>
<h1>수정</h1>
<form action="ExamModifyReg" method="post">
	<table border="">
		<tr>
			<td>ID</td>
			<td><input type="text" name="id" value="<%=dto.getId() %>" readonly/></td>
		</tr>
		<tr>
			<td>학기</td>
			<td>
			<input type="radio" name="hakgi" value="1" 
			<%if(dto.getHakgi()==1){ out.print("checked"); } %>
			 />1
			<input type="radio" name="hakgi" value="2" 
			<%if(dto.getHakgi()==2){ out.print("checked"); } %>
			/>2
			</td>
		</tr>
		<tr>
			<td>시험종류</td>
			<td>
			<input type="radio" name="name" value="semi" 
			<%if(dto.getName().equals("semi")){ out.print("checked"); } %>
			/>중간
			<input type="radio" name="name" value="final"
			<%if(dto.getName().equals("final")){ out.print("checked"); } %>
			 />기말
			</td>
		</tr>
		<tr>
			<td>학생ID</td>
			<td><input type="text" name="pid" value="<%=dto.getPid() %>"/></td>
		</tr>
		<tr>
			<td>암호</td>
			<td><input type="text" name="pw"  value="<%=dto.getPw() %>" /></td>
		</tr>
		<tr>
			<td>국어</td>
			<td><input type="text" name="kor"  value="<%=dto.getKor() %>" /></td>
		</tr>
		<tr>
			<td>영어</td>
			<td><input type="text" name="eng"  value="<%=dto.getEng() %>" /></td>
		</tr>
		<tr>
			<td>수학</td>
			<td><input type="text" name="mat"  value="<%=dto.getMat() %>" /></td>
		</tr>

		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="수정" />
				<a href="ExamDetail?id=<%=dto.getId() %>">뒤로</a>
			</td>
		</tr>
	</table>
</form>
</body>
</html>