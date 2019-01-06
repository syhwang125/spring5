class Mother{
	public void intro() {
		System.out.println("Mom intro.....");
	}
}

class Son  extends Mother {
	public void intro() {
		System.out.println("Son intro .....");
	}
	
	public void say() {
		System.out.println("Son says .....");
	}
}


public class Chap25UpDownCasting {

	public static void main(String[] args) {
		Mother mom = new Mother();
		mom.intro();
		
		Son son = new Son();
		son.intro();
		
		Mother m = new Son();
		m.intro();
		
		// Up casting (자식 클래스를 부모 클래스로 변환) 
		Mother mson = (Mother) son;
		mson.intro();

		Mother upson = son;
		upson.intro();
		
		// upson.say();
		
		// Down Casting 
		Son sss = (Son) mom;
		sss.intro();
		sss.say();
		// Exception in thread "main" java.lang.ClassCastException: Mother cannot be cast to Son 
		
		Son person = (Son) upson;
		person.intro();

	}

}
