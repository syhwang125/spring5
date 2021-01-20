package javapattern.builder;

public abstract class BluePrint {

	abstract public void setCpu();
	abstract public void setRam();
	abstract public void setStorage();
	protected abstract Computer getComputer();
	
}
