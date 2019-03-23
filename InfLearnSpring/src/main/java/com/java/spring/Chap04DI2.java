package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap04DI2 {

	public static void main(String[] args) {
		String configLocation = "classpath:applicationCTX-04.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Chap04MyInfo myInfo = ctx.getBean("myInfo", Chap04MyInfo.class);
		myInfo.getInfo();
		ctx.close();
	}

}
