package javapattern.facade.system;

class HelpSystem3 {
  
	public HelpSystem3() {
		System.out.println("call  consturctor " + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call process " + getClass().getSimpleName());
	}
}
