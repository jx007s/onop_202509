<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mem3</title>
</head>
<body>
	<h1>mem3</h1>
	<table border="">
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("pname") %> ,
			<%=request.getAttribute("pname") %>
			</td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=request.getParameter("age") %> ,
			<%=request.getAttribute("age") %>
			</td>
		</tr>
		<tr>
			<td>결혼</td>
			<td><%=request.getParameter("marriage") %> ,
			<%=request.getAttribute("mmm") %>
			</td>
		</tr>
	</table>
</body>
</html>