package com.my.board;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/list") 
	public String getList(HttpServletRequest request, Model model) {
		
		return "list";
	}
 // http://localhost:8080/board/list
	
	@RequestMapping("/write") 
	public String getWrite(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		model.addAttribute("id",id);
		model.addAttribute("name",request.getParameter("id"));
		model.addAttribute("title",request.getParameter("name"));
		model.addAttribute("content",request.getParameter("content"));
		return "write";
	}
	
	@RequestMapping("/writeOk") 
	public String getWriteOk(Board board) {
		return "writeOk";
	}
	
	
}
