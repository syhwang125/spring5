package com.java.spring;

public class Chap03MyCalculator {

	private int firstNum;
	private int secondNum;
	private Chap03Calculator calculator ;
	
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setCalculator(Chap03Calculator calculator) {
		this.calculator = calculator;
	}


	
	public Chap03MyCalculator() {
		
	}
	
	public void add () {
		calculator.addition(firstNum, secondNum);
	}

	public void sub () {
		calculator.subtraction(firstNum, secondNum);
	}
	
	public void mul () {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div () {
		calculator.division(firstNum, secondNum);
	}
}
