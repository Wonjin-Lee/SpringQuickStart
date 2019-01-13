<!-- Model 1 으로 게시판 구현 -->
<!-- 로그아웃 기능 처리 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// 1. 브라우저와 연결된 세션 객체를 강제 종료한다.
	session.invalidate();

	// 2. 세션 종료 후, 메인 화면으로 이동한다.
	response.sendRedirect("login.jsp");
%>