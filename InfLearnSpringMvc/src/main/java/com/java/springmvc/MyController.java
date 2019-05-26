package com.java.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	// http://localhost:8080/springmvc/list 
	
	@RequestMapping("/list")     // 요청 경로 
	public String list() {
		return "list";            // view jsp name
	}
	
	@RequestMapping("/board/detailedView")    // 요청 경로 
	public String detailedView(Model model) {
		model.addAttribute("id","syacorn");
		return "board/detailedView"; 	// view jsp name
	}
	
	// case : model 
	// http://localhost:8080/springmvc/model/modelEx
	@RequestMapping("/model/modelEx")
	public String modelEx(Model model) {
		model.addAttribute("data","data12345");
		return "model/modelEx";
	}
	
	// case : modelAndView 
	// http://localhost:8080/springmvc/modelView
	@RequestMapping("model/modelView") 
	public ModelAndView modelAndView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id","abcde");
		return mv;
	}
}
