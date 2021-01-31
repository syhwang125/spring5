package javapattern.proxy;

public interface Subject {

	// 리소스가 적게 되는 일 
	void action1();

	
	// 리소스가 많이 드는 일, 네트워크/메모리 등 
	void action2();
}
