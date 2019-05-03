package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

// xml 설정 파
public class Chap08Main2 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX-08-2.xml");
		
		Chap08Admin2Connection admin2Connection = ctx.getBean("chap08Admin2Connection", Chap08Admin2Connection.class);

		
		System.out.println("adminID : " + admin2Connection.getAdminId());
		System.out.println("adminPW : " + admin2Connection.getAdminPw());
		System.out.println("=======================");
		
		System.out.println("sub-adminID : " + admin2Connection.getSubAdminId());
		System.out.println("sub-adminID : " + admin2Connection.getSubAdminPw());
		
		ctx.close();
	}

}
