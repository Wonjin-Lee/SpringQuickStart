/*
 * BoardController 클래스에 통합하면서 모든 라인 주석 처리
 */

/*
package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

// 글 상세 보기 컨트롤러
@Controller
public class GetBoardController {
	@RequestMapping("/getBoard.do")
	public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
		mav.addObject("board", boardDAO.getBoard(vo)); // Model 정보 저장
		mav.setViewName("getBoard.jsp"); // View 정보 저장
		return mav;
	}
}
*/