package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap07MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX-07.xml");
		Chap07Student student1 = ctx.getBean("student",Chap07Student.class);
		System.out.println(student1.getName());
		
		Chap07Student student2 = ctx.getBean("student",Chap07Student.class);
		student2.setName("hong gil soon");
		
		System.out.println(student2.getName());
		
		if(student1.equals(student2)) {
			System.out.println("student1 == student2");
		}
	}

}
