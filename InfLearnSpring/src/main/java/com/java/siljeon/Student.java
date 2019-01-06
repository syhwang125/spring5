package com.java.siljeon;

public class Student {

	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public void getInfo() {
		System.out.println(" getInfo's name -> " + name + " score -> " + score);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if (score > 50)
			this.score = score;
	}

}
