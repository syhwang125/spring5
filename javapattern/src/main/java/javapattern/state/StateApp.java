package javapattern.state;

public class StateApp {

	public static void main(String[] args) {
		Light light = new Light();
		light.off();
		light.on();
		light.off();
		light.on();
		
		light.on();
		light.off();
		
	}

}
