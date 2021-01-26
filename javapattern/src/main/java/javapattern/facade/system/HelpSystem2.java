package javapattern.facade.system;

class HelpSystem2 {
  
	public HelpSystem2() {
		System.out.println("call  consturctor " + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call process " + getClass().getSimpleName());
	}
}
