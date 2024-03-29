package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap09Main1 {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCTX-09.xml");
		Chap09Student student = ctx.getBean("student", Chap09Student.class);
		student.getStudentInfo();
		
		Chap09Worker worker = ctx.getBean("worker", Chap09Worker.class);
		worker.getWorkerInfo();
		
		ctx.close();

	}

}
