<%@page import="basic_p.LogMember"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logReg</title>
</head>
<body>
<%
LogMember mem = List.of(
			new LogMember("aaa","강다빈","1111"),
			new LogMember("bbb","강라빈","2222"),
			new LogMember("ccc","강마빈","3333"),
			new LogMember("ddd","강바빈","4444"),
			new LogMember("eee","강사빈","5555")
			).stream()
			.filter(m->m.memChk(request))
			.findFirst()
			.orElse(null);

	String msg = "로그인 실패";
	if(mem!=null){
		msg = mem.getPname() +" 로그인 성공";
		session.setAttribute("pid", mem);
	}
%>

	<script type="text/javascript">
		alert("<%=msg%>")
		location.href="logMain.jsp";
	</script>
</body>
</html>