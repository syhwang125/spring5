package javapattern.abstfactory.win;

import javapattern.abstfactory.abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("win Button Click");
	}

	

}
