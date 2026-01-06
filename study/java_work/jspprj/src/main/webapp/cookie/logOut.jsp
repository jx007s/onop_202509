<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logOut</title>
</head>
<body>
<h1>logOut</h1>
<%
	String msg="";
	for(Cookie coo: request.getCookies()){
		if(coo.getName().equals("pname")){
			msg = coo.getValue()+" 님 로그아웃 되었습니다."; 
		}
	}
	
	Cookie coo1 = new Cookie("pid","");
	coo1.setMaxAge(0);
	Cookie coo2 = new Cookie("pname","");
	coo2.setMaxAge(0);
	
	response.addCookie(coo1);
	response.addCookie(coo2);

%>

	<script type="text/javascript">
		alert("<%=msg%>")
		location.href="logMain.jsp";
	</script>
</body>
</html>