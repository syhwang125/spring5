package com.java.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Chap06Main {

	public static void main(String[] args) {
		
		//  XML 파일을 이용한 DI 설정방법  
		/*
		String configLocation1 = "classpath:applicationCTX-06.xml";
		String configLocation2 = "classpath:applicationCTX-06-1.xml";
		AbstractApplicationContext ctx1 = new GenericXmlApplicationContext(configLocation1, configLocation2);
		
		Chap06Student student = ctx1.getBean("student1", Chap06Student.class);
		System.out.println(student.getName());   // hong gil dong
		System.out.println(student.getAge());
		System.out.println(student.getHobbys());
		System.out.println(student.getHeight());
		System.out.println(student.getWeight());
		
		Chap06StudentInfo studentInfo = ctx1.getBean("studentInfo1",Chap06StudentInfo.class);
		Chap06Student student2 = studentInfo.getStudent();	// std1 == std2
		System.out.println(student2.getName());
		System.out.println(student2.getAge());
		System.out.println(student2.getHobbys());
		
		if(student.equals(student2)) {
			System.out.println("student == student2" );
		}
		
		System.out.println("-----------------");
		Chap06Student student3 = ctx1.getBean("student3", Chap06Student.class);
		System.out.println(student3.getName());
		
		if(student.equals(student3)) {
			System.out.println("student == student3 " + student3.getName());
		} else {
			System.out.println("student != student3 " + student3.getName());
		}
		
		Chap06Family family = ctx1.getBean("family",Chap06Family.class);
		System.out.println(family.getPapaName());
		System.out.println(family.getMamiName());
		System.out.println(family.getBrotherName());
		System.out.println(family.getSisterName());
		
		ctx1.close();
		*/
		
		
		// java 를 이용한 DI 설정 방법 -> xml 대신 config class 에 bean class, id 가 명시됨 
		/*
		AnnotationConfigApplicationContext ctx2 
				= new AnnotationConfigApplicationContext(Chap06AppConfig.class);
		
		Chap06Student student4 = ctx2.getBean("student4", Chap06Student.class);
		System.out.println(student4.getName());
		System.out.println(student4.getAge());
		System.out.println(student4.getHobbys());
		System.out.println(student4.getHeight());
		System.out.println(student4.getWeight());

		System.out.println("-----------------");
		
		Chap06Student student5 = ctx2.getBean("student5", Chap06Student.class);
		System.out.println(student5.getName());
		System.out.println(student5.getAge());
		System.out.println(student5.getHobbys());
		System.out.println(student5.getHeight());
		System.out.println(student5.getWeight());
		
		ctx2.close();
		*/
		
		// XML 과 Java 를 같이 사용 
		
		AbstractApplicationContext ctx3 = new GenericXmlApplicationContext("classpath:applicationCTX-06-2.xml");
		Chap06Student student6 = ctx3.getBean("student6", Chap06Student.class);
		System.out.println(student6.getName());   // hong gil dong
		System.out.println(student6.getAge());
		System.out.println(student6.getHobbys());
		System.out.println(student6.getHeight());
		System.out.println(student6.getWeight());
		
		Chap06Student student7 = ctx3.getBean("student7",Chap06Student.class);
		System.out.println(student7.getName());   // hong gil dong
		System.out.println(student7.getAge());
		System.out.println(student7.getHobbys());
		System.out.println(student7.getHeight());
		System.out.println(student7.getWeight());
		
		ctx3.close();
	}

}
