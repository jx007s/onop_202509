<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2> 공지사항이지</h2>
<section>
<%
	for(String tt :(List<String>)request.getAttribute("mainData") ){%>
		<div><%=tt %></div>
<%	} %>


</section>