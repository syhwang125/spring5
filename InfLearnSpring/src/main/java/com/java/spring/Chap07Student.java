package com.java.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chap07Student implements InitializingBean, DisposableBean {

	private String name;
	private String age;
	
	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	} 

	public Chap07Student(String name, String age) {
		this.name = name;
		this.age = age;
	}
	
	
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void destroy() throws Exception {
		System.out.println("destroy method called ");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("initialzing method called ");
		
	}

}
