package javapattern.strategy.game;

public class GameApp {

	public static void main(String[] args) {
		GameCharacter character = new GameCharacter();
		
		character.attack();	// 맨손 공격 
		
		character.setWeapon(new Knife());   
		character.attack();    // 칼 공격 
		
		character.setWeapon(new Sword());
		character.attack();    // 검 공격 
		
	}

}
