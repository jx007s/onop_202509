<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mem4</title>

</head>
<body>
	<h1>mem4</h1>
	person : <%=request.getAttribute("person") %><br>
	pr : <%=request.getAttribute("pr") %><br>
	<table border="">
		<tr>
			<td>이름</td>
			<td><%=request.getParameter("pname") %> ,
			
			</td>
		</tr>
		<tr>
			<td>나이</td>
			<td><%=request.getParameter("age") %> ,
			
			</td>
		</tr>
		<tr>
			<td>결혼</td>
			<td><%=request.getParameter("marriage") %> ,
			
			</td>
		</tr>
	</table>
</body>
</html>