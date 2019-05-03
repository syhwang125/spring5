package com.java.springboard.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.java.springboard.command.BoardCommand;
import com.java.springboard.command.BoardContentCmd;
import com.java.springboard.command.BoardDeleteCmd;
import com.java.springboard.command.BoardListCmd;
import com.java.springboard.command.BoardModifyCmd;
import com.java.springboard.command.BoardReplyCmd;
import com.java.springboard.command.BoardReplyViewCmd;
import com.java.springboard.command.BoardWriteCmd;
import com.java.springboard.util.Constant;


// http://localhost:8080/springboard/ 


@Controller
public class BoardController {

	BoardCommand command;
	
	public JdbcTemplate template;
 
	@Autowired
	public void setTemplate(JdbcTemplate template) {
        System.out.println( "나와라1"+template.getDataSource() );
	    try {
            System.out.println(  "나와라1"+template.getDataSource().getConnection() );
        } catch ( SQLException e ) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		this.template = template;
		Constant.template = this.template;
	}

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list method started...");
		command = new BoardListCmd();
		command.execute(model);
		return "list";	//list.jsp 로 이동 
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view method started...");
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write method started...");
		model.addAttribute("request", request);
		command = new BoardWriteCmd();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request, Model model) {
		System.out.println("content_view method started...");
		model.addAttribute("request",request);
		command = new BoardContentCmd();
		command.execute(model);
		return "content_view";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify method started...");
		model.addAttribute("request",request);
		command = new BoardModifyCmd();
		command.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		System.out.println("reply_view method called..");
		model.addAttribute("request",request);
		command = new BoardReplyViewCmd();
		command.execute(model);
		return "reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		System.out.println("reply method called");
		model.addAttribute("request",request);
		command = new BoardReplyCmd();
		command.execute(model);
		return "redirect:list";
	}
	
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete method called");
		model.addAttribute("request",request);
		command = new BoardDeleteCmd();
		command.execute(model);
		return "redirect:list";
	}
	
}
