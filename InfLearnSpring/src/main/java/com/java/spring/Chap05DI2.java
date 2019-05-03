package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap05DI2 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX-05-2.xml");
		Chap05Pencil pencil = ctx.getBean("pencil", Chap05Pencil.class);
		pencil.use();
		
		Chap05Pencil pencil2 = ctx.getBean("pencil2", Chap05Pencil.class);
		pencil2.use();
		
		ctx.close();

	}

}
