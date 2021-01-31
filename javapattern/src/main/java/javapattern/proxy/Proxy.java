package javapattern.proxy;

public class Proxy implements Subject {

	private RealSubject real;
	
	public Proxy(RealSubject real) {
		this.real = real;
	}
	@Override
	public void action1() {
		System.out.println("간단한 업무 by proxy");
	}

	@Override
	public void action2() {
		System.out.println("-----");
		this.real.action2();
		System.out.println("복잡한 업무 by proxy");
	}

}
