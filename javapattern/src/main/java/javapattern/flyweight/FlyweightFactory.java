package javapattern.flyweight;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {

	Map<String, Flyweight> pool ;
	
	FlyweightFactory() {
		pool = new TreeMap<>();
	}
	
	public Flyweight getFlyweight(String key) {
		Flyweight fly = pool.get(key);
		
		if(fly == null) {
			fly = new Flyweight(key);
			pool.put(key, fly);
			System.out.println("new key ..." + key);
		} else {
			System.out.println("already key ." + key);
		}
		return fly;
		
	}
}
