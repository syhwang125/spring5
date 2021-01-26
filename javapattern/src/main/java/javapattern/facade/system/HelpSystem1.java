package javapattern.facade.system;

class HelpSystem1 {
  
	public HelpSystem1() {
		System.out.println("call  consturctor : " + getClass().getSimpleName());
	}
	
	public void process() {
		System.out.println("Call process : " + getClass().getSimpleName());
	}
}
