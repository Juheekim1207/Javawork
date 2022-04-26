<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.0.js"></script>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Brush+Script&display=swap" rel="stylesheet">  
</head>
<%
	//한글 엔코딩
	request.setCharacterEncoding("UTF-8");
	
	String fcolor = request.getParameter("fcolor");
	String birth = request.getParameter("birth");
	String[] hobby = request.getParameterValues("hobby"); //선택안할시 null
	String[] photo = request.getParameterValues("photo");
%>
<body>
	<div style="color: <%=fcolor%>">
		글자색 : <%=fcolor %><br>
		생년월일 : <%=birth %><br>
		나의 취미 : 
		<%
		if(hobby == null) {%>
			없음
		<%}else{
				for(String h:hobby)
				{%>
					[<%=h%>]&nbsp;
				<%}
		}
		%>
		<br>
		인형목록 : 
		<%
		if(photo == null) {%>
			없음
		<%} else{
				for(String p:photo)
				{%>
						<img src="<%=p%>"> 		
				<%}
		}	
		%> 
	</div>
</body>
</html>
