package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.mvc.Controller;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

// 글 수정 컨트롤러
public class UpdateBoardController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 수정 처리");
		
		// 1. 사용자 입력 정보 추출
		// request.setCharacterEncoding("UTF-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String seq = request.getParameter("seq");
		
		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.updateBoard(vo);
		
		// 3. 화면 네비게이션
		// getBoardList.jsp 로 리다이렉트 하는 것이 아니라
		// 수정된 글이 포함된 글 목록을 다시 검색해야 하기 때문에 getBoardList.do 로 리다이렉트.
		return "getBoardList.do";
	}
}
