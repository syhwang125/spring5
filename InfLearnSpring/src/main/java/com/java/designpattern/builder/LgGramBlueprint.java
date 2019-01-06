package com.java.designpattern.builder;

public class LgGramBlueprint extends BluePrint {
	private Computer computer;

	public LgGramBlueprint() {
		computer = new Computer("default", "default", "default");
	}

	@Override
	public void setCpu() {
		computer.setCpu("17");
	}

	@Override
	public void setRam() {
		computer.setRam("32");

	}

	@Override
	public void setStorage() {

		computer.setStorage("300");
	}

	@Override
	public Computer getComputer() {

		return this.computer;
	}

}
