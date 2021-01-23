package javapattern.strategy.game;

public class Sword implements Weapon {

	@Override
	public void attack() {
		System.out.println("칼 공격 ");
	}
}
