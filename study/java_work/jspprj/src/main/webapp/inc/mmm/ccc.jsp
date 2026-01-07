<%@page import="java.util.Arrays"%>
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>ccc 입니다.</h2>

<%=request.getParameter("pname") %>,
<%=request.getParameter("pid") %><br/>
<%
	int b = 200;
	Date now = (Date)request.getAttribute("now");
	LogMember mem = (LogMember)request.getAttribute("mem");
	int [] arr =  (int [])request.getAttribute("arr");
%>
<%=now.getDay()%><br/>
<%=mem%><br/>
<%=Arrays.toString(arr)%><br/>
<!-- 
html 태그 (프론트태그) 는 url 기준
<img src="../../fff/family14.JPG"/> -->
<img src="../fff/family14.JPG"/>