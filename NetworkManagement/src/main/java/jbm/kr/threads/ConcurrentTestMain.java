package jbm.kr.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ConcurrentTestMain {
	static int index=0;
	
	public static void main(String[] args) {
		ThreadFactory tf = new ThreadFactory() {

			@Override
			public Thread newThread(Runnable r) {
				Thread thread = new Thread(r);
				System.out.println("Runnable [ " + index++ + "] is created");
				return thread;
			}
		};
		
		// 쓰레드를 5개까지만 만드는 쓰레드풀 생성 
		ExecutorService p = Executors.newFixedThreadPool(5,tf);
		
		try {
			for(int i=0; i<100; i++) {
				Runnable r = new TestRunnable2(i);
				p.execute(r);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		p.shutdown();

	}

}

 class TestRunnable2 implements Runnable {
	int index;
	public TestRunnable2(int i) {
		index = i;
	}
	@Override
	public void run() {
		System.out.println(index);
		
	}
}
