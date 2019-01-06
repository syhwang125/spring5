package industry;

public class Machine {
	// no modifier (default)  : private + 같은 패키지 
	// protected    default + 자식 클래스만 
	// public      어디서든 호출 가
	// private 	   오직 같은 클래스 
	
	public void public_run() {
		System.out.println("public running ... " );
	}
	

	void default_run() {
		System.out.println("default running.... ");
	}
	
	protected void protected_run() {
		System.out.println("protected  running.... ");
	}

	private void private_run() {
		System.out.println("private  running.... ");
	}
	
	public static void main(String[] args) {
	
		Machine m = new Machine();
		m.private_run();
	}
}
