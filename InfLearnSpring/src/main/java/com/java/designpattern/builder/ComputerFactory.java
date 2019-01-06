package com.java.designpattern.builder;

public class ComputerFactory {

	private BluePrint print;
	
	public void setBluePrint(BluePrint print) {
		this.print = print;
		
	}
	
	public void make() {
		print.setRam();
		print.setCpu();
		print.setStorage();
	}
	
	public Computer getComputer() {
		return print.getComputer();
	}

	public void makeAndGet() {
		
		
	}

}
