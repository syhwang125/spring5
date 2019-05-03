package com.java.spring;

public class Chap05StudentInfo {

		private Chap05Student student;
		
		public Chap05StudentInfo (Chap05Student student) {
			this.student = student;
		}
		
		public void getStudentInfo() {
			if(student!=null) {
				System.out.println( " name : " + student.getName());
				System.out.println( " age : " + student.getAge());
				System.out.println( " grade : " + student.getGrade());
				System.out.println( " number : " + student.getClassNum());
			}
		}

		public void setStudent(Chap05Student student) {
			this.student = student;
		}
}
