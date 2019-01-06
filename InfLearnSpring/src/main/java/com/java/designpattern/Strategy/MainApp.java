package com.java.designpattern.Strategy;

// 인터페이스 
// 델리게이트 (위임)
// 전략패턴 : 
public class MainApp {

	public static void main(String[] args) {
		AInterface a = new AInterfaceImpl();
		a.funcA();

		AObject aobj = new AObject();
		aobj.funcAA();
	}

}
