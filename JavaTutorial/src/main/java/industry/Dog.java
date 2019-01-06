package industry;

public class Dog extends Animal {

	public void move() {
		System.out.println("Dog is moving.....");
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		eat();
		move();
	}

}
