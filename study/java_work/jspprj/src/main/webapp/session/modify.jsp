<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify</title>
</head>
<body>
<h1>modify</h1>
<%
session.setAttribute("ss_id", "asdf");
session.setAttribute("ss_marriage", true);
session.setAttribute("ss_arr", List.of(44,55,66));

%>
</body>
</html>