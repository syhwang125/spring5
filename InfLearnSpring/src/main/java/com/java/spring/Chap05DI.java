package com.java.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.java.siljeon.Student;

public class Chap05DI {

	public static void main(String[] args) {

		String configPath = "classpath:applicationCTX-05.xml" ;
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configPath);
		Chap05StudentInfo studentInfo= ctx.getBean("studentInfo", Chap05StudentInfo.class);
		studentInfo.getStudentInfo();
		
		System.out.println("=======");
		
		Chap05Student student2 = ctx.getBean("student2", Chap05Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		ctx.close();
	}

}
