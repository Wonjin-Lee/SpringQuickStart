<!-- Model 1 으로 게시판 구현 -->
<!-- 로그인 검증 페이지 -->

<%@ page import="com.springbook.biz.user.UserVO" %>
<%@ page import="com.springbook.biz.user.impl.UserDAO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 1. 사용자 입력 정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// 2. DB 연동 처리
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	
	UserDAO userDAO = new UserDAO();
	UserVO user = userDAO.getUser(vo);
	
	// 3. 화면 네비게이션
	if(user != null) {
		// user 가 null 이 아니면 getBoardList.jsp(글 목록 페이지) 으로 이동
		response.sendRedirect("getBoardList.jsp");
	} else {
		// user 가 null 이면 다시 login.jsp(로그인 페이지) 으로 이동
		response.sendRedirect("login.jsp");
	}
%>