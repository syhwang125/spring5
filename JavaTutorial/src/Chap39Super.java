
class Animals {
	public Animals(String name) {   //constructor
		System.out.println(name + "(Animal) is created...");
	}
	public void move() {
		System.out.println("Animal is moving...");
	}
}

class Birds extends Animals {
	public Birds(String name) {   //constructor
	    super(name);    //매개변수가 없는 경우 코드가 숨어있다. 먼저 호출된다. 
		System.out.println("Bird is created...");
	}
	
	public void move() {
		System.out.println("Bird is flying...");
	}
	public void test() {
		super.move();
		this.move();
	}
}

class Cats extends Animals {

	public Cats(String name) {
		super(name);
	}
	
}

public class Chap39Super {

	public static void main(String[] args) {
		Birds bird = new Birds("Angel");		// super class생성자부터 호출된다. 
		bird.test();

	}

}
