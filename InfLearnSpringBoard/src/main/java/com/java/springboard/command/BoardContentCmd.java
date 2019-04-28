package com.java.springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.springboard.dao.BoardDao;
import com.java.springboard.dto.BoardDto;

public class BoardContentCmd implements BoardCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bId = request.getParameter("bId");
		System.out.println("BoardContentCmd is called");
		
		BoardDao dao = new BoardDao();
		BoardDto dto = dao.contentView(bId);
		
		model.addAttribute("content_view",dto);
	}

}
