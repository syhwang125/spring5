package com.java.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Chap14Controller {

	//  http://localhost:8080/springmvc/index
	
	@RequestMapping("/index")
	public String goIndex() {
		return "index";
	}
	
	
	// index.jsp 에서 값을 입력한 후 submit을 누르면 
	// http://localhost:8080/springmvc/student?id=14   (GET으로 하면 ) 
	// http://localhost:8080/springmvc/student    (post)
	@RequestMapping(method=RequestMethod.GET, value="/student") 
	public String goStudent(HttpServletRequest httpServletRequest, Model model) {
		System.out.println("RequestMethod.GET");
		
		String id = httpServletRequest.getParameter("id");
		System.out.println("id : " + id);
		model.addAttribute("studentId", id);
		return "student/studentId";
	}
	
	// Get, Post 둘다 받고 싶으면 오버로딩을통해 두가지 메소드 선언 
	// form tag 에서 요청경로 /student 로 옴 
	@RequestMapping(method=RequestMethod.POST, value="/student") 
	public ModelAndView goStudent(HttpServletRequest httpServletRequest) {
		System.out.println("RequestMethod.POST");
		
		String id = httpServletRequest.getParameter("id");
		System.out.println("id : " + id);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("student/studentId");
		mv.addObject("studentId", id);
		return mv;
	}
	
}
