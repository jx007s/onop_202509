<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
section{
	width: 500px;
	height: 500px;
	padding: 20px;
	
}
section > img{
	display:block;
	float:left;
	width: 200px;
	height: 200px;
	margin: 15px;
	
}
</style>
<h2> 갤러리이지롱</h2>
<section>
<%
	for(String tt :(List<String>)request.getAttribute("mainData") ){%>
		<img src="/fff/<%=tt %>"/>
<%	} %>


</section>