package com.java.springmvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chap14Model {

	private static final Logger logger = LoggerFactory.getLogger(Chap14Model.class);
	@RequestMapping("/index14M")
	public String index() {
		return "/index14M";
	}
	
	@RequestMapping("/student/studentView")
	public String studentView(@ModelAttribute("stdInfo") StudentInfo studentInfo) {
		return "student/studentView";
	}
}
