package com.java.siljeon;

public class StaticVariable16 {

	public static void main(String[] args) {
		EmployeeBank eb = new EmployeeBank("박찬호");
		EmployeeBank eb2 = new EmployeeBank("이승엽");
		
		eb.saveMoney(1000);			// 1000 넣고 돈 안씀 
		
		eb2.saveMoney(300);			//	300 넣고 1000을 사용함 
		eb2.spendMoney(500);
		eb2.spendMoney(500);
		
		eb.getBankInfo();			// 1000 넣고 안썼는데, 300남음 
		eb2.getBankInfo();			// 300 넣고 1000을 썼는데 300 남음 
		
	}

}
