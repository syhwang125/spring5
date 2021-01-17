package jbm.kr.threads;

import java.util.LinkedList;

public class ThreadPoolQueue {

		private LinkedList<Object> queue = new LinkedList<Object>();
		private int MAX_QUEUE_SIZE=5;
		private boolean DEBUG = false;
		
		public ThreadPoolQueue(int MAX_QUEUE_SIZE) {
			this.MAX_QUEUE_SIZE = MAX_QUEUE_SIZE;
		}
		
		public synchronized void enqueue(Object item) throws InterruptedException {
			while(queue.size()==MAX_QUEUE_SIZE) {
				console("enqueue waiting...");
				wait();
			}
			
			if(queue.size()==0) {
				console("enqueue notifyall...");
				notifyAll();
			}
			
			console("enqueue addding...");
			queue.add(item);
		}

		

		public synchronized Object dequeue() throws InterruptedException {
			while(queue.size()==0) {
				console("dequeue waiting.....");
				wait();
			}
			
			if(queue.size()==MAX_QUEUE_SIZE) {
				console("dequeue notifyall..");
				notifyAll();
			}
			
			console("dequeue removing...");
			return queue.remove(0);
			
		}
		
		public void toggleDebug(boolean flag) {
			this.DEBUG = flag;
		}
		
		public void console(String msg) {
			if(DEBUG)
				System.out.println(msg);
		}

}
