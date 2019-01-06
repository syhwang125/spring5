package com.java.siljeon;

public class EmployeeBank {

	String name;
	static int amount = 0;

	public EmployeeBank(String name) {
		this.name = name;
	}

	public void saveMoney(int money) {
		amount += money;
		System.out.println("save amount : " + amount);
	}

	public void spendMoney(int money) {
		amount -= money;
		System.out.println("spend amount : " + amount);
	}

	public void getBankInfo() {
		System.out.println("Employee name : " + this.name + " amount " + amount);
		// System.out.println("amount : " + amount);
	}

}
