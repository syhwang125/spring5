package javapattern.abstfactory.linux;

import javapattern.abstfactory.abst.Button;

public class LinuxButton implements Button {

	@Override
	public void click() {
		System.out.println("Button Click");
	}

	

}
