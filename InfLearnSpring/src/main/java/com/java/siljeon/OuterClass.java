package com.java.siljeon;

public class OuterClass {

	int num = 10;
	String str1 = "java";
	static String str11 = "world";
	
	public OuterClass() {
		System.out.println("Outerclass constructor");
	}
	
	class InnerClass{
		int num = 100;
		String str2 = str1;
		
		public InnerClass() {
			System.out.println("Innerclass constructor");
		}
	}
	
	static class SInnerClass{
		int num = 100;
		String str3 = str11;
		
		public SInnerClass() {
			System.out.println("Innerclass constructor");
		}
	}
}
