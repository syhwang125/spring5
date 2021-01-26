package javapattern.observer;

import javapattern.observer.Button.OnClickListener;

public class ObserverApp {

	public static void main(String[] args) {
		Button button = new Button();
		button.setOnClickListener(new OnClickListener() {
			
			public void onClick(Button button) {
				System.out.println( button + " is clicked " );
				
			}
		});
		button.onClick();
	}


}
