package industry;

public class Fox extends Animal {

	public void move() {
		System.out.println("Fox is moving.....");
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		eat();
		move();
	}

}
