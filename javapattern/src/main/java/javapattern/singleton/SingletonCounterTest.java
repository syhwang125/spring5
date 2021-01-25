package javapattern.singleton;

public class SingletonCounterTest {

	public static void main(String[] args) {
		SingletonCounterTest test = new SingletonCounterTest();
		test.Amethod();
		test.Bmethod();
		
		Singleton1 s1 = Singleton1.getInstance();
		System.out.println(s1);
		
		Singleton2 s2 = Singleton2.getInstance();
		System.out.println(s2);
		
		Singleton3 s3 = Singleton3.getInstance();
		System.out.println(s3);
		
		Singleton4 s4 = Singleton4.getInstance();
		System.out.println(s4);
	}
	
	public void Amethod() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("Amethod에서 카운터 호출 " + sc.getNextInt());
	}

	public void Bmethod() {
		SingletonCounter sc = SingletonCounter.getInstance();
		System.out.println("Bmethod에서 카운터 호출 " + sc.getNextInt());
	}
}
