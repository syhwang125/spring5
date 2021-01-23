package javapattern.abstfactory.mac;

import javapattern.abstfactory.abst.Button;

public class MacButton implements Button {

	@Override
	public void click() {
		System.out.println("mac Button Click");
	}

	

}
