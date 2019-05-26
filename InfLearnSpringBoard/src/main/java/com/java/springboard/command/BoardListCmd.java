package com.java.springboard.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.java.springboard.dao.BoardDao;
import com.java.springboard.dto.BoardDto;

public class BoardListCmd implements BoardCommand {

	@Override
	public void execute(Model model) {
		BoardDao dao = new BoardDao();
		System.out.println("## BoardListCmd is called.... ");
		ArrayList<BoardDto> dtos = dao.list();
		model.addAttribute("list",dtos);
	}

}
