package com.boot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boot.domain.BoardVO;
import com.boot.mapper.BoardMapper;

@RestController
public class BoardListController {
 
	@Autowired
	private BoardMapper boardMapper;
	
	@RequestMapping("/board")
	public ModelAndView board() throws Exception{
		
		List<BoardVO> board = boardMapper.boardList();
		
		return new ModelAndView("boardList","list",board);
//		return board;
		
	}
}
