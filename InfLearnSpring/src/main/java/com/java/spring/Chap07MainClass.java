package com.java.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap07MainClass {

	public static void main(String[] args) {
		System.out.println("1");
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		System.out.println("2");
		ctx.load("classpath:applicationCTX-07.xml");
		System.out.println("3");
		ctx.refresh();
//		System.out.println(((Chap07Student)ctx.getBean("student")).getName());
//		System.out.println(((Chap07Student)ctx.getBean("otherStudent")).getName());
		System.out.println("4");
		ctx.close();
		

	}

}
