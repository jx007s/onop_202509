<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>b</title>
</head>
<body>
	<h1>b</h1>
	<script type="text/javascript">
		//response.sendRedirect 가 있을 경우 실행안함
		alert("왔어 1?")
		location.href="e.jsp"  
	</script>
	<%
		System.out.println("b 진입 1");
		response.sendRedirect("c.jsp");
	
		//response.sendRedirect("d.jsp"); 에러발생
		
		System.out.println("b 진입 2");  //정상실행
	%>
	
	<script type="text/javascript">
		//response.sendRedirect 가 있을 경우 실행안함
		alert("왔어 2?")
		location.href="e.jsp" 
	</script>
</body>
</html>

<%--
/////영화 예매 사이트를 제작하세요

예매창
영화종류 : 아이언맨,슈퍼맨,마트맨
인원수

-----------------------------------

처리창
영화종류의 결과창으로 이동
아이언맨 : 인원수 그대로 
슈퍼맨 : 인원수+1
마트맨 : 인원수*2
-----------------------------------
 --%>

