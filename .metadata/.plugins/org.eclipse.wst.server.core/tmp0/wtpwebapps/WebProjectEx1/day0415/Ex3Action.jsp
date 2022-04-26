<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Brush+Script&display=swap" rel="stylesheet">  
<style>
	body * {
	font-size: 2rem;
	font-family: 'Jua';
	}
</style>
</head>
<%
	//form tag 읽기 - get 방식일 경우 (tomcat8부터 한글 안깨짐)
	String name = request.getParameter("name");
	String email = request.getParameter("email");
	String driver = request.getParameter("driver"); //체크시 on, 해제시 null
%>

<body>
	<b>이 름: </b><%=name%><br>
	<b>이메일: </b><%=email%><br>
	<b>운전면허: </b><%=driver==null? "없음" : "있음"%><br>
	
</body>
</html>