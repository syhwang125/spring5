package javapattern.observer;

import java.util.Observable;

public class Button2 extends Observable {
	public void onClick() {
		setChanged();
		notifyObservers();
	}

}
