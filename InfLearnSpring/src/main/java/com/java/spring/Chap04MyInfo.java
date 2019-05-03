package com.java.spring;

import java.util.ArrayList;

public class Chap04MyInfo {

	private String name;
	private double height ;
	private double weight;
	private ArrayList<String> hobby;
	private Chap04BMICalculator bmiCalculator;
	
	
	public Chap04BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	
	public void setBmiCalculator(Chap04BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public ArrayList<String> getHobby() {
		return hobby;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}
	public void bmiCalculator() {
		bmiCalculator.bmiCalculation(weight, height); 
	} 
	
	public void getInfo() {
		System.out.println(" name : " + name) ;
		System.out.println(" height : " + height) ;
		System.out.println(" weight : " + weight) ;
		System.out.println(" hobby : " + hobby) ;
		bmiCalculator();
	}
	
}
