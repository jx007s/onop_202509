<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>examDelete</title>
</head>
<body>
<script type="text/javascript">
	alert('삭제완료')
	location.href='/exam/examList/${pageInfo.getPNo()}'
</script>
</body>
</html>