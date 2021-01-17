package jbm.kr.threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {
	private ThreadPoolQueue queue;
	private List<ThreadPoolRunnable> runnableList = new ArrayList<ThreadPoolRunnable>();
	private volatile boolean running = true;
	
	public ThreadPool(int MAX_THREAD_NUM, int MAX_QUEUE_SIZE) {
		queue = new ThreadPoolQueue(MAX_QUEUE_SIZE);
		for(int i=0; i<MAX_THREAD_NUM; i++) {
			runnableList.add(new ThreadPoolRunnable(i,queue));
		}
		for(ThreadPoolRunnable r : runnableList) {
			new Thread(r).start();
		}
 	}
	
	public synchronized void execute(Runnable item) throws Exception {
		if(!running) {
			throw new Exception("ThreadPool is not running");
		}
		queue.enqueue(item);
	}
	
	public synchronized void stop() throws InterruptedException {
		running = false;
		for(ThreadPoolRunnable r : runnableList) {
			r.stop();
		}
	}
	
	public void toggleDebugWithRunnable(boolean flag) {
		for(ThreadPoolRunnable r:runnableList) {
			r.toggleDebug(flag);
		}
	}
	
	public void toggleDebugWithQueue(boolean flag) {
		queue.toggleDebug(flag);
	}
}
