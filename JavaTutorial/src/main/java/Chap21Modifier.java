
import industry.Machine;

// no modifier (default)  : private + 같은 패키지 
// protected    default(같은 패키지)  + 자식 클래스만 
// public      어디서든 호출 가능 
// private 	   오직 같은 클래스 

public class Chap21Modifier {
	public static void main(String[] args) {
		
		Machine m = new Machine();
		
		// m.private_run;		
		
		// m.default_run();		// not visible error
		
		// m.protected_run();	// not visible 같은 패키지에서만 볼 수 있음 
		
		m.public_run();
		
	}

}
