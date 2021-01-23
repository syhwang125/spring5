package javapattern.composite;

abstract public class Component {

	public String name;

	public Component(String name) {
		this.name = name;			
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
