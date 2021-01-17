package jbm.kr.threads;

public class TestMain {

	public static void main(String[] args) {
		ThreadPool p = new ThreadPool(5, 10);
		p.toggleDebugWithQueue(true);	// 아이템 큐 콘솔 디버깅 ON
		p.toggleDebugWithRunnable(true);   // 쓰레드 콘솔 디버깅 ON
		
		try {
			for(int i = 0; i<100; i++) {
				Runnable r = new TestRunnable(i);
				p.execute(r);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			p.stop();
		} catch(InterruptedException e) {
			System.out.println("ThreadPool is stopped");
		}
	}

}

class TestRunnable implements Runnable {
	int index;
	public TestRunnable(int i) {
		index = i;
	}
	@Override
	public void run() {
		System.out.println(index);
	}
	
	
}
