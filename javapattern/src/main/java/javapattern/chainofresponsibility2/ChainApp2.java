package javapattern.chainofresponsibility2;

public class ChainApp2 {

	public static void main(String[] args) {
		Attack attack = new Attack(100);
		Armor armor = new Armor(10);
		Armor armor2 = new Armor(15);

		armor.setNextDefense(armor2);
		armor.defense(attack);
		
		System.out.println(attack.getAmount());
	}

}
