package com.java.spring;

import javax.annotation.*;

public class Chap07OtherStudent {
	private String name;
	private String age;
	
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	} 

	public Chap07OtherStudent(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	@PostConstruct
	public void initMethod() {
		System.out.println("initMethod");
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("destroyMethod");
	}

	
}
