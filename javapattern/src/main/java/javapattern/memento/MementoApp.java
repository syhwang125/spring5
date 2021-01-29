package javapattern.memento;

import java.util.Stack;

public class MementoApp {

	public static void main(String[] args) {
		
		Stack<Memento> mementos = new Stack<>();
		
		Originator org = new Originator();
		
		org.setState("state 1");
//		Memento memento1 = org.createMemento();
//		mementos.push(memento1);	
		mementos.push(org.createMemento());
		
		
		org.setState("state 2");
		mementos.push(org.createMemento());
		org.setState("state 3");
		mementos.push(org.createMemento());
		org.setState("state final ");
		mementos.push(org.createMemento());
		
		org.restoreMemento(mementos.pop());   
		System.out.println(org.getState());    // final
		org.restoreMemento(mementos.pop());  
		System.out.println(org.getState());    // 3
		org.restoreMemento(mementos.pop());
		System.out.println(org.getState());     // 2
		org.restoreMemento(mementos.pop());
		System.out.println(org.getState());    //1
	}

}
