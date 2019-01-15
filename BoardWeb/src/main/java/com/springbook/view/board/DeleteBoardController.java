package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.view.controller.Controller;

// 글 삭제 컨트롤러
public class DeleteBoardController implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("글 삭제 처리");
		
		// 1. 사용자 입력 정보 추출
		String seq = request.getParameter("seq");

		// 2. DB 연동 처리
		BoardVO vo = new BoardVO();
		vo.setSeq(Integer.parseInt(seq));
		
		BoardDAO boardDAO = new BoardDAO();
		boardDAO.deleteBoard(vo);
		
		// 3. 화면 네비게이션
		// getBoardList.jsp 로 리다이렉트 하는 것이 아니라
		// 게시물을 삭제후 갱신된 글 목록을 다시 검색해야 하기 때문에 getBoardList.do 로 리다이렉트.
		return "getBoardList.do";
	}
}
