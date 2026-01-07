<%@page import="java.util.Arrays"%>
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>bbb 입니다.</h2>

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

<img src="../fff/family20.JPG"/>


