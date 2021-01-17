package jbm.kr.threads;

public class ThreadPoolRunnable implements Runnable {

	private int id;
	private ThreadPoolQueue queue; 
	private volatile boolean running = true; 
	private boolean DEBUG = false;
	
	public ThreadPoolRunnable(int THREAD_ID, ThreadPoolQueue queue) {
		this.id = THREAD_ID;
		this.queue = queue; 
		console("ThreadPoolLRunable [ " + id + " ] is created ");
	}
	

	@Override
	public void run() {
		while(running) {
			try {
				Thread.sleep(10);
				console("ThreadPoolLRunable [ " + id + " ] is working ");
				Runnable r = (Runnable) queue.dequeue();
				r.run();
			} catch(InterruptedException e) {
				stop();
			}
		}
		console("ThreadPoolLRunable [ " + id + " ] is dead ");

	}

	public void toggleDebug(boolean flag) {
		this.DEBUG = flag;
	}
	
	public  void console(String msg) {
		if(DEBUG) 
			System.out.println(msg);
		
	}
	
	public  void stop() {
		console("ThreadPoolLRunable [ " + id + " ] is stopped ");
		
	}

}
