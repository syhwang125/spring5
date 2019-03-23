package com.java.spring;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Chap06AppConfig {

	@Bean
	public Chap06Student student4() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("swimming");
		hobbys.add("cooking");
		
		Chap06Student student = new Chap06Student("hong gil dong", 20, hobbys);
		student.setHeight(180);
		student.setWeight(78);
		return student;
		
	}
	
	@Bean
	public Chap06Student student5() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("reading");
		hobbys.add("singing");
		
		Chap06Student student = new Chap06Student("hong gil soon", 18, hobbys);
		student.setHeight(165);
		student.setWeight(55);
		return student;
		
	}
}
