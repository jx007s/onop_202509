<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String title = request.getParameter("title");
	int cnt = 0;
	if(request.getParameter("cnt")!=null){
		cnt = Integer.parseInt(request.getParameter("cnt"));
	}
	
	switch(title){
	case "super":
		cnt++;
		break;
	case "mart":
		cnt *= 2;
		break;
	}

	response.sendRedirect("movie/"+title+".jsp?cnt="+cnt);
%>