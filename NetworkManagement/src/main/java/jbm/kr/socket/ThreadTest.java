package jbm.kr.socket;

import java.util.ArrayList;
import java.util.Random;

// 1. 쓰레드상속받은 클래스 
// http://jdm.kr/blog/69 자바 쓰레드 기초 

// Thread join : 메인 메소드가 자신이 실행시킨 쓰레드들이 전부 종료되기 전에 먼저종료되는 것을 해결하기 위해 쓰레드 조인을 이용한다. 
// Thread Synchronized : 쓰레드 사이에 공통적으로 사용해야 할 객체가 있다면 동기화 해야 한다. 

public class ThreadTest  extends Thread{

	private static int index=0;	//쓰레드 동작시 값을 증가시켜 보자. 
	
	private int id=-1;
	public ThreadTest(int id) {
		this.id = id;
	}
	
	public void run() {
		System.out.println(id + " 번 쓰레드 동작 중 ... " );
		Random r = new Random(System.currentTimeMillis());
		
		try {
			long s = r.nextInt(3000);   //3초 내에 끝내자 
			Thread.sleep(s);            // 쓰레드 잠시 멈춤  
//			index++;
			setIndex();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		System.out.println(id + "번 쓰레드 동작 종료시 current index 는 " + index ); 
	}
	
	
	private synchronized static void setIndex() {
		index++;	//index 변수를 증가시킨다. 
	}

	public static void main(String[] args) {
		System.out.println("Start main method:");
		
		ArrayList<Thread> threadList = new ArrayList<Thread>();    // 중요하다!!!!! 
		
		for ( int i=0; i<10; i++) {
			ThreadTest test = new ThreadTest(i);
			test.start();		// 이 메소드를 실행하면 Thread 내의 run() 을 수행한다. 
			
			threadList.add(test);		//생성한 쓰레드를 리스트에 삽입 !!!!!!!!!!
		}
		
		// 이렇게 Thread join 을 사용하면 main method가 끝날때까지 기다린다. 
		for(int i =0; i <threadList.size(); i++) {				// 조인함수를 써서 실행하자. @@@@@
			try {
				// Thread.sleep(5000); // 쓰레드가 종료될때까지 충분한 시간을 기디린다.
				threadList.get(i).join();   //쓰레드의 처리가 끝날때까지 기다린다. @@@@@@@@@
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main method가 끝날떄의 current Index " + index);
		System.out.println( "End main method    ...");

	}

}
