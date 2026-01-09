<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정완료</title>
</head>
<body>
<h1>수정완료</h1>
<script type="text/javascript">
	alert("수정완료")
	location.href="ExamDetail?id=<%=request.getAttribute("id")%>"
</script>
</body>
</html>