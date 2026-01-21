<%@page import="java.util.Map"%>
<%@page import="java.util.LinkedHashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
header > div{
	float: left;
	width: 200px;
	height: 50px;
	line-height: 50px;
	text-align: center;
}
</style>
<header> 
<%
 
 LinkedHashMap< String , String> topMenu =
 (LinkedHashMap< String , String>)request.getAttribute("topMenu");
	//System.out.println(topMenu);
	
	for(Map.Entry<String, String>me : topMenu.entrySet()){
%>
  
<div><a href="/company/<%=me.getKey() %>"><%=me.getValue() %></a></div>
<%} %>
</header>