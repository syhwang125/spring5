package javapattern.strategy;

public class StragetyApp {

	public static void main(String[] args) {
		
		// 인터페이스 
		AInterface a = new AInterfaceImpl();
		a.funcA();
		
		AObj aObj = new AObj();
		aObj.funcAA();
		
	}

}
