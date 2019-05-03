package com.java.spring;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;

public class Chap06ApplicationConfig {
	@Bean
	public Chap06Student student7() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("dancing");
		hobbys.add("cooking");
		
		Chap06Student student = new Chap06Student("hong gil ja", 13, hobbys);
		student.setHeight(160);
		student.setWeight(45);
		return student;
		
	}
}
