package javapattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverApp2 {

	public static void main(String[] args) {
		Button2 button = new Button2();
		
		button.addObserver(new Observer() {
			@Override
			public void update(Observable observable, Object o) {
				System.out.println(observable + " is Clicked");
			}
		});

		button.onClick();
		button.onClick();
		button.onClick();
	}

}
