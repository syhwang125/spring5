package javapattern.flyweight;

public class FlyweightApp {

	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly = factory.getFlyweight("A");    // new key
		fly.getData();
		System.out.println(fly);
		
		fly = factory.getFlyweight("A");	// already 
		System.out.println(fly);
		
		fly = factory.getFlyweight("A");     //already
		System.out.println(fly);
	}

}
