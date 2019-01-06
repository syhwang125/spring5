package com.java.designpattern.Factory.framework;

public abstract class ItemCreator {
	public Item create(String itemName){
		
		init(itemName);
		Item item = createItem(itemName);
		end(itemName);
		
		return item;
	}
	
	abstract protected String end(String itemName);
	abstract protected String init(String itemName);
	abstract protected Item createItem(String itemName);
}
