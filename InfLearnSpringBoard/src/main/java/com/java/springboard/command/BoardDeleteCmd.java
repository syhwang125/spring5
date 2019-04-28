package com.java.springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.java.springboard.dao.BoardDao;

public class BoardDeleteCmd implements BoardCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		System.out.println("### BoardDeleteCmd called " + bId);
		BoardDao dao = new BoardDao();
		dao.delete(bId);

	}

}
