package javapattern.chainofresponsibility2;

public class Armor implements Defense {

	private Defense nextDefense;
	private int def; // 방어력 
	
	
	public Armor() {
		
	}
	/**
	 * @param nextDefense
	 * @param def
	 */
	public Armor(int def) {
		this.def = def;
	}

	@Override
	public void defense(Attack attack) {
		process(attack);
		if(nextDefense != null) {
			nextDefense.defense(attack);
		}
			
	}

	private void process(Attack attack) {
		int amount = attack.getAmount();
		amount -= def ;
		attack.setAmount(amount); 
	}

	public Defense getNextDefense() {
		return nextDefense;
	}

	public void setNextDefense(Defense nextDefense) {
		this.nextDefense = nextDefense;
	}
	
	
}
