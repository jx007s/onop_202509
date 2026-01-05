<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>diary</title>
<style>
        *{
            margin:0;
            padding:0;
        }
        img{
            width: 400px;
        }
        td{
            padding:10px;
        }
        tr:nth-of-type(3) > td:nth-of-type(1){
            background-color: #f00;
            color: #fff;
        }
        tr:nth-of-type(3) > td:nth-of-type(7){
            background-color: #00f;
            color: #fff;
        }
        tr:nth-of-type(3)~tr > td{
            text-align: right;
        }
        tr:nth-of-type(3)~tr > td:nth-of-type(1){
            color: #f00;
        }
        tr:nth-of-type(3)~tr > td:nth-of-type(7){
            color: #00f;
        }
        .now{
            background-color: #ff0;
        }
    </style>
</head>
<body>
	<h1>diary</h1>
	<%
		Date today = new Date();
		String title = new SimpleDateFormat("yyyy년 MM월").format(today);
		
		int now = today.getDate();
		today.setDate(1);
		String first = "<td></td>".repeat(today.getDay());
		Calendar cd = Calendar.getInstance();
		int last = cd.getActualMaximum(Calendar.DATE);
		
		
	%>	

    
    <table cellpadding="3px" border="" cellspacing="0">
        <tr>
            <td colspan="7">
                <img src="fff/family13.JPG" alt="">
            </td>
        </tr>
        <tr>
            <td colspan="7" align="center">
                <h2><%=title %></h2>
            </td>
        </tr>
        <tr align="center">
        		<%for(char ch:"일월화수목금토".toCharArray()) {%>
        			<td><%=ch %></td>
        		<%} %>
        	</tr><tr>
            <%=first %>
            <% for(int i =1 ; i<=last; i++) {
            		today.setDate(i);
            		
            		String cls = "";
            		if(now==i){
            			cls = "class='now'";
            		}
            %>
            <td <%=cls %>><%=i %></td>
            <% if(today.getDay()==6) {%>
            </tr><tr>
            <%}} %>
        </tr>
        <tr>
           

        </tr>
    </table>
	
	
	
</body>
</html>