package com.springbook.view.user;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;

// 로그인 컨트롤러
@Controller
public class LoginController {
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("test");
		vo.setPassword("test123");
		return "login.jsp";
	}
	
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String login(UserVO vo, UserDAO userDAO, HttpSession session) {
		UserVO user = userDAO.getUser(vo);
		if(userDAO.getUser(vo) != null) {
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		else return "login.jsp";
	}
}
