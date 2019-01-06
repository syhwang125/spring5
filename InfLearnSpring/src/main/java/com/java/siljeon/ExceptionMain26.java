package com.java.siljeon;

public class ExceptionMain26 {

	public static void main(String[] args) {
		
		int i=10;
		int j=0;
		int r = 0;
		
		System.out.println("Exception before");
		
		try {
			r = i/j;
		} catch(Exception e) {
			e.printStackTrace();
			String msg = e.getMessage();
			System.out.println(msg);
		} finally {
			System.out.println("#### finally #####");
		}
		System.out.println("Exception after");

		System.out.println();
		
		// throw exception 
		System.out.println("######### Throw Exception ");
		ExceptionMain26 main = new ExceptionMain26();
		try {
			main.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void firstMethod() throws Exception {
		System.out.println("firstMethod called");
		secondMethod();
	}
	
	public void secondMethod() throws Exception {
		System.out.println("secondMethod called");
		thirdMethod();
	}
	
	public void thirdMethod() throws Exception {
		System.out.println("thirdMethod called");
		int i = 10/40;
		System.out.println(i);
	}

}
