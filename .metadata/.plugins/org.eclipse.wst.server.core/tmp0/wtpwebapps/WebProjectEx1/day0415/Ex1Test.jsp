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
<style type="text/css">
	/*css영역*/
	
	
</style>
<script type="text/javascript">
	$(function() {
		//js,jQuery영역
	});
</script>
</head>
<body>
	<%=msg%><br>
	
	<%! //선언문 : 서블릿으로 변환시 멤버변수(전역변수)로 등록 
	String msg = "Happy day!!";
	
	%>
	<% //scriptlet, 자바영역, 서블릿으로 변환시 지역변수로 등록 : 출력은 아래에서 실행해야한다
	String msg2 ="안녕하세요";
	%>
	
	<!-- 출력은 표현식으로 출력:소스보기에서 보임 (다른 사람에게 보여줄때) -->
	<%--jsp 주석 : 소스보기에서 안보임 (특정코드를 비실행문으로 작성할때:나만 볼때) --%>
	
	<%=msg%><br>
	<%=msg2%><br>
	
	<%
		String[] str = {"red","orange","blue","pink","cyan","magenta"};	
	%>
	 <table class = "table table-bodered" style="width:200px;">
	 <%
	 	for(String s:str){%>
	 		<tr>
	 			<th><%=s%></th>
	 			<td bgcolor="<%=s%>">color</td>
	 		</tr>
	 	<%}
	 	%>
	 </table>
</body>
</html>












