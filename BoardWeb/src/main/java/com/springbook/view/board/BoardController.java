package com.springbook.view.board;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

// 컨트롤러들을 하나로 통합
@Controller
@SessionAttributes("board")
public class BoardController {
	// 글 등록
	@RequestMapping("/insertBoard.do")
	public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.insertBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	// 글 수정
	// getBoard 비지니스 메소드가 호출될 때 Model 에 board 라는 이름으로 BoardVO 객체가 생성되는데
	// SessionAttributes("board") 를 통해 세션에도 board 가 저장된다.
	@RequestMapping("/updateBoard.do")
	public String updateBoard(@ModelAttribute("board") BoardVO vo, BoardDAO boardDAO) {
		boardDAO.updateBoard(vo);
		return "getBoardList.do";
	}
	
	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
		boardDAO.deleteBoard(vo);
		return "getBoardList.do";
	}
	
	// 글 상세 조회
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
		model.addAttribute("board", boardDAO.getBoard(vo)); // Model 정보 저장
		return "getBoard.jsp"; // View 이름 리턴
	}
	
	// 검색 조건 목록 설정
	@ModelAttribute("conditionMap")
	public Map<String, String> searchConditionMap() {
		Map<String, String> conditionMap = new HashMap<String, String>();
		conditionMap.put("제목", "TITLE");
		conditionMap.put("내용", "CONTENT");
		return conditionMap;
	}
	
	// 글 목록 검색
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, BoardDAO boardDAO, Model model) {
		// Model 정보 저장
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		return "getBoardList.jsp"; // View 이름 리턴
	}
}
