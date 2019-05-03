package com.java.springmvc;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class Chap15Validator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return StudentInfo.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		System.out.println("validate()");
		StudentInfo student = (StudentInfo)target;
		
		// case 1. validate() 메소드에서 로직 처리 
		/*
		String studentName = student.getName();
		if(studentName == null || studentName.trim().isEmpty()) {
			System.out.println("studentName is null or empty");
			errors.rejectValue("name", "name is empty");
		}
		
		String studentAge = student.getAge();
		if(studentAge.equals("0")) {
			System.out.println("studentAge is 0");
			errors.rejectValue("age", "age is zero");
		}
		
		System.out.println("student name = " + studentName + " , student age = " + studentAge);
		*/
		
		// case 2. validationUtils 클래스 이용 
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "err");

		
		
	}

}
