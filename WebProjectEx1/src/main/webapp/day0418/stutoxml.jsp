<?xml version="1.0" encoding="UTF-8"?>
<%@page import="mysql.data.StuDto"%>
<%@page import="mysql.data.StuDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/xml; charset=UTF8"
    pageEncoding="UTF8"%>

 <%
 	StuDao dao = new StuDao();
 	List<StuDto> list = dao.getAllDatas();
 %>
 <list>
 <%
 	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
 	for(StuDto dto:list)
 	{%>
 		<stu>
 		<num><%=dto.getNum()%></num>
 		<name><%=dto.getName()%></name>
 		<photo><%=dto.getPhoto()%></photo>
 		<hp><%=dto.getHp()%></hp>
 		<addr><%=dto.getAddr()%></addr>
 		<writeday><%=sdf.format(dto.getWriteday())%></writeday>
 		</stu>
 		<%	
 	}%>
 </list>
     