package com.java.designpattern.Factory;

import com.java.designpattern.Factory.framework.Item;
import com.java.designpattern.Factory.framework.ItemCreator;

public class FactoryMain {

	public static void main(String args[]) {
		ItemCreator creator = new DefaultItemCreator();

		Item item1 = creator.create("나무칼");
		Item item2 = creator.create("나무방패");
		Item item3 = creator.create("나무갑주");
		
		item1.use();
		item2.use();
		item3.use();
	}
}
