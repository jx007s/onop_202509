<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spFrm" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>회원가입 폼</h1>

<form method="post">
<table>
	<tr>
		<td>id</td>
		<td><input type="text" name="pid" />
			<br/>
			<spFrm:errors path="person.pid"/>
		</td>
	</tr>
	<tr>
		<td>이름</td>
		<td><input type="text" name="pname" />
		<br/>
			<spFrm:errors path="person.pname"/>
		</td>
	</tr>
	<tr>
		<td>나이</td>
		<td><input type="text" name="ageStr" />
		<br/>
			<spFrm:errors path="person.ageStr"/>
		</td>
	</tr>
	<tr>
		<td>생일</td>
		<td><input type="date" name="birthStr" />
		<br/>
			<spFrm:errors path="person.birthStr"/>
		</td>
	</tr>
	<tr>
		<td>이메일</td>
		<td><input type="text" name="email" />
		<br/>
			<spFrm:errors path="person.email"/>
		</td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="text" name="tel" />
		<br/>
			<spFrm:errors path="person.tel"/>
		</td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="회원가입" /></td>
	</tr>
</table>
</form>
</body>
</html>