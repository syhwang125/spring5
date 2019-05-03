package com.java.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chap14Redirect {

	private static final Logger logger = LoggerFactory.getLogger(Chap14Redirect.class);
	
	// http://localhost:8080/springmvc/studentConfirm?id=abc 
	// -> http://localhost:8080/springmvc/studentNg 
	// http://localhost:8080/springmvc/studentConfirm?id=syacorn
	// -> http://localhost:8080/springmvc/studentOk
	@RequestMapping("/studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		if(id.equals("syacorn")) {
			return "redirect:studentOk";
		}
		return "redirect:studentNg";
	}
	
	@RequestMapping("/studentOk")
	public String studentOk(Model model) {
		return "student/studentOk";
	}
	
	@RequestMapping("/studentNg")
	public String studentNg(Model model) {
		return "student/studentNg";
	}
	
	// http://localhost:8080/springmvc/studentURL1
	@RequestMapping("/studentURL1")
	public String studentURL1(Model model) {
		return "redirect:http://localhost:8080/springmvc/studentURL1.jsp";
	}
	
	@RequestMapping("/studentURL2")
	public String studentURL2(Model model) {
		return "redirect:/springmvc/studentURL2.jsp";
	}
	
}
