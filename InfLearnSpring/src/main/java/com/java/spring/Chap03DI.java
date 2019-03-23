package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap03DI {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX-03.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Chap03MyCalculator myCalculator = ctx.getBean("myCalculator", Chap03MyCalculator.class);

		myCalculator.add();
		 myCalculator.sub();
		 myCalculator.mul();
		 myCalculator.div();
	}
}
