package com.java.designpattern.Strategy;

public class AObject {

	AInterface ainterface;

	public AObject() {
		ainterface = new AInterfaceImpl();
	}

	public void funcAA() {
		ainterface.funcA();

		ainterface.funcA();
	}
}
