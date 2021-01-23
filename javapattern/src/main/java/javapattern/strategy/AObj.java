package javapattern.strategy;

public class AObj {


	private AInterface ainterface;
	
	public AObj() {
		this.ainterface = new AInterfaceImpl();
	}
	
	public  void funcAA() {
		// 위임한다 
		ainterface.funcA();
		ainterface.funcA();

//		System.out.println("AAAA");
//		System.out.println("BBBB");
	}
}
