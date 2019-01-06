package com.java.designpattern.Prototype2;

public class Cat {

	private String name; 
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public Cat copy() throws CloneNotSupportedException {
		Cat ret = (Cat) this.clone();
		return ret;
	}

}
