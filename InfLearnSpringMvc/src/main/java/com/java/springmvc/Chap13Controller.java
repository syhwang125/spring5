package com.java.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Chap13Controller {

	private static final Logger logger = LoggerFactory.getLogger(Chap13Controller.class);
	
	// 13-1) httpServletRequest 를 이용하는 경우 
	// http://localhost:8080/springmvc/member/memberView?id=user&pw=passwd 	
	@RequestMapping("/member/memberView")
	public String viewMember(HttpServletRequest httpServletRequest, Model model) {
		String id = httpServletRequest.getParameter("id");
		String pw = httpServletRequest.getParameter("pw");
		
		model.addAttribute("id", id); 
		model.addAttribute("pw",pw);
		
		return "member/memberView";
	}
	
	// 13-2) @RequestParam 을 이용해서 데이터를 전송하는 경우 
	// http://localhost:8080/springmvc/member/checkId?id=user&pw=1234
	@RequestMapping("member/checkId")
	public String checkId(@RequestParam("id") String id, @RequestParam("pw") String pw, Model model) {
		model.addAttribute("identity", id) ;
		model.addAttribute("password",pw);
		return "member/checkId";
	}

	/*
	// 13-3) 데이터 객체를 이용했으나, @RequestParam을 사용할 필요가 없음  13-4)와 같이 단순하게 할 수 있다.
	//http://localhost:8080/springmvc/member/join?name=hong&id=abc&pw=1234&email=abc@abc.com
	@RequestMapping("member/join") 
	public String joinData(@RequestParam("name") String name,
						   @RequestParam("id") String id, 
						   @RequestParam("pw") String pw,
						   @RequestParam("email") String email,
						   Model model) {
		Member member = new Member();
		member.setName(name);
		member.setId(id);
		member.setPw(pw);
		member.setEmail(email);
		model.addAttribute("member",member);
		return "member/join";
	}
	*/
	
	// 13-3) 데이터 객체를 이용하는 경우 
	// http://localhost:8080/springmvc/member/join?name=hong&id=abc&pw=1234&email=abc@abc.com
	@RequestMapping("member/join") 
	public String joinData(Member member) {
		return "member/join";
	}
	
	// http://localhost:8080/springmvc/member/10
	@RequestMapping("/member/{id}")
	public String getId(@PathVariable String id, Model model) {
		model.addAttribute("identity", id);
		return "member/checkId";
	}
	
}

