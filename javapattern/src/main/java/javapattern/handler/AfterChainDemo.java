package javapattern.handler;

import java.util.Random;

public class AfterChainDemo {

	public static void main(String[] args) {
		Handler rootChain = new Handler();
		rootChain.add(new Handler());
		rootChain.add(new Handler());
		
		rootChain.add(new Handler());
		rootChain.wrapAround(rootChain);
		
		for (int i = 1; i < 6; i++) {
			System.out.println(" Operation # " + i + ":" );
			rootChain.execute(i);
			System.out.println();
		}
	}
}

class Handler {
	private static final Random RANDOM = new Random();
	private static int nextID = 1;
	private int id = nextID++;
	private Handler nextInChain;
	
	public void add(Handler next) {
		if(nextInChain == null) {
			nextInChain = next;
		} else {
			nextInChain = next;
		}
	}
	
	public void wrapAround(Handler root) {
		if (nextInChain == null) {
			nextInChain = root;
		} else {
			nextInChain.wrapAround(root);
		}
	}
	
	public void execute(int num) {
		if (RANDOM.nextInt(4) != 0) {
			System.out.println(" " + id + " -busy ");
			nextInChain.execute(num);
		}
		System.out.println(id + " -handled-" + num);
	}
}
