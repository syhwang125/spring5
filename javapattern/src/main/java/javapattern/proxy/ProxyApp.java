package javapattern.proxy;

public class ProxyApp {

	public static void main(String[] args) {
		RealSubject real = new RealSubject();
		Proxy proxy = new Proxy(real);

		real.action1();
		real.action2();
		
		proxy.action1();
		proxy.action2();
		
		Proxy proxy2 = new Proxy(real);
		proxy2.action1();
		proxy2.action2();
	}

}
