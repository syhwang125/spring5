package com.java.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chap15Controller {

	@RequestMapping("/studentForm")
	public String studentForm() {
		return "student/createPage";
	}
	// case1, case 2
	/*
	@RequestMapping("/student/create")
	public String studentCreate(@ModelAttribute("studentInfo") StudentInfo stdInfo, BindingResult result) {
		String page="student/createDonePage";
		
		Chap15Validator validator = new Chap15Validator();
		System.out.println("Chap15Controller studentCreate : name = " + stdInfo.getName() + " , age = " + stdInfo.getAge());
		validator.validate(stdInfo, result);
		if(result.hasErrors()) {
			page = "student/createpage";
		}
		return page;
	}
	*/
	
	@RequestMapping("/student/create")
	public String studentCreate(@ModelAttribute("studentInfo") StudentInfo stdInfo, BindingResult result) {
		String page="student/createDonePage";
		if(result.hasErrors()) {
			page = "student/createpage";
		}
		return page;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		binder.setValidator(new Chap15Validator());
	}
}


// http://localhost:8080/springmvc/studentForm  
// http://localhost:8080/springmvc/student/create?name=syacorn&age=0