package com.java.designpattern.Factory;

import com.java.designpattern.Factory.framework.Item;
import com.java.designpattern.Factory.framework.ItemCreator;

public class DefaultItemCreator extends ItemCreator {

	@Override
	protected String end(String itemName) {
		System.out.println("Default 마무리 작업!");
		return itemName;
	}

	@Override
	protected String init(String itemName) {
		System.out.println("Default 초기 작업!");
		return itemName;
	}

	@Override
	protected Item createItem(String itemName) {
		return new DefaultItem(itemName);
	}

}
