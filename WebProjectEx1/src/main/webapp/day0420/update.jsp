<%@page import="mysql.data.ShopDao"%>
<%@page import="mysql.data.ShopDto"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>

<%
	//한글 엔코딩 : post로 보낼것
	request.setCharacterEncoding("UTF-8");

	//데이터 읽기
	String num = request.getParameter("unum");
	String sangpum = request.getParameter("usangpum");
	String color = request.getParameter("ucolor");
	String photo = request.getParameter("uphoto");
	String ipgoday = request.getParameter("uipgoday");
	int price = Integer.parseInt(request.getParameter("uprice"));
	int cnt = Integer.parseInt(request.getParameter("ucnt"));
	System.out.print(cnt);
	
	//dto
	ShopDto dto = new ShopDto();
	dto.setNum(num);
	dto.setSangpum(sangpum);
	dto.setColor(color);
	dto.setPhoto(photo);
	dto.setPrice(price);
	dto.setCnt(cnt);
	dto.setIpgoday(ipgoday);
	
	
	//dao
	ShopDao dao = new ShopDao();
	
	//메서드 호출
	dao.shopUpdate(dto);

%>