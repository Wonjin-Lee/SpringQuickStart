package com.springbook.view.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 모든 Controller의 최상위 인터페이스
public interface Controller {
	String handleRequest(HttpServletRequest request, HttpServletResponse response);
}
