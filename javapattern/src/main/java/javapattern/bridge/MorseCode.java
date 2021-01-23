package javapattern.bridge;

public class MorseCode {

	private MorseCodeFunction function;
	
	public MorseCode(MorseCodeFunction fucntion) {
		this.function = function;
	}
	
	public void setFunction(MorseCodeFunction function) {
		this.function = function;
	}
	
	public void dot() {
		function.dot();		//deligate 
	}
	
	public void dash() {
		function.dash();
	}
	
	public void space() {
		function.space();
	}
	
}
