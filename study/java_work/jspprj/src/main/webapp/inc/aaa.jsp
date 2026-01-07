<%@page import="java.util.Arrays"%>
<%@page import="basic_p.LogMember"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int c = 300;
%>
<%
	int b = 200;
	Date now = (Date)request.getAttribute("now");
	LogMember mem = (LogMember)request.getAttribute("mem");
	int [] arr =  (int [])request.getAttribute("arr");
%>
<h2>aaa 입니다.</h2>

<%-- <%=a %>,<%=b %><br/>  변수 공유하지 않음--%>
<%=c %>,<%=b %>,
<%=request.getParameter("pname") %>,
<%=request.getParameter("addr") %>,
<%=request.getParameter("gender") %>,
<%=request.getParameter("pid") %>,<br/>
<%=now.getDay()%><br/>
<%=mem%><br/>
<%=Arrays.toString(arr)%><br/>