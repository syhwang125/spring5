package com.java.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

// Environment 객체를 이해서 프로퍼티 추가 및 추출하는 방법 
public class Chap08Main {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:chap08admin.properties"));
			System.out.println("admin.id : " + env.getProperty("admin.id"));
			System.out.println("admin.pw : " + env.getProperty("admin.pw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext gCtx = (GenericXmlApplicationContext) ctx;
		gCtx.load("applicationCTX-08.xml");
		gCtx.refresh();
		
		System.out.println("=======================");
		
		Chap08AdminConnection adminConnection = gCtx.getBean("chap08AdminConnection", Chap08AdminConnection.class);
		System.out.println("admin ID : " + adminConnection.getAdminId());
		System.out.println("admin PW : " + adminConnection.getAdminPw());
		gCtx.close();
		ctx.close();
		
	}

}
