package com.java.springmvc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 * InfLearn Spring 강좌에서 11번째 스프MVC 기초 
 * 애플리케이션 실행하고 브라우저에서 http://localhost:8080/springmvc 
 * 
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	// http://localhost:8080/springmvc
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";    // view jsp name 
	}
	
	// http://localhost:8080/board/view
	
	@RequestMapping("/board/view") 
	public String view() {
		return "board/view";
	}
	
	// http://localhost:springmvc/board/content
	
	@RequestMapping("/board/content") 
	public String content(Model model) {
		model.addAttribute("id",30);
		return "board/content";
	}
	
	// http://localhost:8080/board/reply
	@RequestMapping("/board/reply") 
	public ModelAndView reply() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",30);
		mv.setViewName("board/reqply");
		return mv;
	}
	
}
