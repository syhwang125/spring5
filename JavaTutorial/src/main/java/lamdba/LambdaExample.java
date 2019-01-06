package lamdba;

public class LambdaExample {
	/*
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i=0; i < 10; i++) {
					System.out.println("hello");
				}
			}
		}).start();
	}
	*/
	
	
	
	public static void main(String[] args) {
		new Thread ( () -> 	{
			for (int i=0; i < 10; i++) {
					System.out.println("hello");
				}
		}).start();
	} 
}
