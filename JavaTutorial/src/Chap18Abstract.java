class Animal {
	
}

class Bird extends Animal{
	void move() {
		System.out.println("I can fly");
	}
}

public class Chap18Abstract {
	public static void main(String[] args) {
		Bird b = new Bird();
		b.move();
	}
	
	
}
