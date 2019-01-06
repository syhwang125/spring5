class Human {
	void showInfo() {
		System.out.println("All human begins are equal. ");
	}
	
	void showInfo(String name) {
		
	}
}

class Asian extends Human {
	void showInfo(String name) {
		System.out.println(name + " is an Asian > < ");
	}
	
	void greeting() {
		System.out.println("hello, good morning!!");
	}
}

// 다형성 (polymorphism) 
// 부모 클래스를 객체 타입으로 두고 자식클래스를 객체화시키는 기술 
public class Chap22Polymorphism {

	public static void main(String[] args) {
		Asian asian = new Asian();
		asian.showInfo();
		asian.greeting();

		Human human = new Asian();	
		human.showInfo();
		// human.greeting();
		
		Human rin = asian;
		rin.showInfo("Rin"); 
		
		Asian jane = asian;
		jane.showInfo("Jane");
		jane.greeting();
		
	}

}
