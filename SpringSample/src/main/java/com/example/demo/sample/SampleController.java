package com.example.demo.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class SampleController {

	private SampleRepository sampleRepository;
	private ApplicationContext applicationContext;
	
	
	public SampleController(SampleRepository sampleRepository, ApplicationContext applicationContext) {
		this.sampleRepository = sampleRepository;
		this.applicationContext = applicationContext;
	}

	public SampleController(SampleRepository sampleRepository) {
		this.sampleRepository = sampleRepository;
		sampleRepository.save();
	}

	public SampleController() {
		sampleRepository.save();
	}
	
	@GetMapping("/bean")
	@ResponseBody
	public String bean() {
		return " bean : " + applicationContext.getBean(SampleController.class);
	}
}
