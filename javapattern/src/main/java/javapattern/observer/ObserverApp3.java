package javapattern.observer;

import java.util.Observable;
import java.util.Observer;

public class ObserverApp3 {

	public static void main(String[] args) {
		// 1.generic
		// 2.delegate
		// 3.내부에 옵저버를 넣는다. 
		
		
		Button2 button = new Button2();
		
		button.addObserver(new Observer<String>() {
			@Override
			public void update(Observable<String> o, Object o) {
				System.out.println(observable + " is Clicked");
			}
		});

		button.onClick();
		button.onClick();
		button.onClick();
	}
}
