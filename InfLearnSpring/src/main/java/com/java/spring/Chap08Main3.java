package com.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Chap08Main3 {

	// java 설정 파일을 통해서 외부파일을 읽어오는 방법 @Configuration 
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.refresh();
		Chap08AdminConnection admin3Connection = ctx.getBean("adminConfig",Chap08AdminConnection.class);
		
		System.out.println("adminID : " + admin3Connection.getAdminId());
		System.out.println("adminPW : " + admin3Connection.getAdminPw());
		System.out.println("=======================");
		
//		System.out.println("sub-adminID : " + admin3Connection.getSubAdminId());
//		System.out.println("sub-adminID : " + admin3Connection.getSubAdminPw());
		
		ctx.close();
	}

}
