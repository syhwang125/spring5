package jbm.kr.socket;

import java.util.ArrayList;
import java.util.Random;

// 2. Runnable 인터페이스를 상속받은 클래스  http://jdm.kr/blog/72
// Thread를 상속받은 클래스처럼 start 메소드가 없으므로, 별도의 쓰레드를 생성해 주고 구현한 runnable 인터페이스를 인자로 넘겨준다. 

public class RunnableTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Start main method ... ");
		
		Runnable r = new ConcreteRunnable();
		ArrayList<Thread> threadList = new ArrayList<Thread>();  //쓰레드들을 담을 객체 
		
		for(int i=0; i<10; i++) {
			Thread test = new Thread(r);	//Runnable 인터페이스를 사용해서 새로운 쓰레드 생성 
			test.start();					// 이 메소드를 실행하면 Thread 내의 run() 수행 
			threadList.add(test);			// 생성한 쓰레드를 리스트에 삽입 
		}
		
		for(Thread t:threadList) {
			t.join();
		}
		
		System.out.println("End main method......");

	}

}

class ConcreteRunnable implements Runnable {

	private int index=0;
	
	@Override
	public void run() {
		System.out.println("foo.run method....");
		
		Random r = new Random(System.currentTimeMillis());
		long s = r.nextInt(3000); 
		
		try {
			Thread.sleep(s);
		} catch (InterruptedException e ) {
			e.printStackTrace();
		}
		addIndex();
	}

	//내부 변수를 동기화해서 사용 !!
	// 동기화 이슈가 궁금ㅎ다면 synchronized 키워드를 삭제해서 여러번 실행할 것 
	synchronized void addIndex() {
		index++;
		System.out.println("current index value : " + index);
	}
}