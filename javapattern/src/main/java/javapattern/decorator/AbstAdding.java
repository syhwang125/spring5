package javapattern.decorator;

// decorator : 실질적인 컴포넌트들을 다루는 
abstract public class AbstAdding implements IBeverage{
	private IBeverage base;
	
	public AbstAdding(IBeverage base) {
		super();
		this.base = base;
	}
	
	public int getTotalPrice() {
		return base.getTotalPrice();
	}
	
	protected IBeverage getBase() {
		return base;
	}

}
