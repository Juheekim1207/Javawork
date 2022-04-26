<%@page import="mysql.data.ShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>

 
<%
	//num 읽기
	String num = request.getParameter("num");
	
	//dao 선언
	ShopDao dao = new ShopDao();
	
	//delete 메서드 호출
	dao.shopDelete(num);

%>