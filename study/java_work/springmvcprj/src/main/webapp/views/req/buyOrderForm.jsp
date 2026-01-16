<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buyOrderForm</title>
</head>
<body>
<h1>buyOrderForm</h1>

<form method="post">
	<table border="">
		<tr>
			<td>제품명</td>
			<td>가격</td>
			<td>수량</td>
		</tr>
		
		<!-- <tr>
			<td><input type="text" name="prods[0].pname" /></td>
			<td><input type="text" name="prods[0].price"/></td>
			<td><input type="text" name="prods[0].cnt"/></td>
		</tr>
		<tr>
			<td><input type="text" name="prods[1].pname" /></td>
			<td><input type="text" name="prods[1].price"/></td>
			<td><input type="text" name="prods[1].cnt"/></td>
		</tr> -->
		
		<% for(int i = 0; i<5 ; i++) {%>
		<tr>
			<td><input type="text" name="prods[<%=i %>].pname" /></td>
			<td><input type="text" name="prods[<%=i %>].price"/></td>
			<td><input type="text" name="prods[<%=i %>].cnt"/></td>
		</tr>
		<%} %>
		
		
		<tr>
			<td rowspan="3">주소</td>
			<td>우편번호</td>
			<td><input type="text" name="ad.zipcode"/></td>
		</tr>
		<tr>
			
			<td>기본주소</td>
			<td><input type="text" name="ad.addr1"/></td>
		</tr>
		<tr>
			
			<td>상세주소</td>
			<td><input type="text"  name="ad.addr2" /></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><input type="submit" value="주문" /></td>
		</tr>
	</table>
</form>
</body>
</html>