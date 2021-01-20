package javapattern.factorymethod;

import javapattern.factorymethod.concrete.HpCreator;
import javapattern.factorymethod.concrete.MpCreator;
import javapattern.factorymethod.framework.Item;
import javapattern.factorymethod.framework.ItemCreator;

public class FactoryApp {

	public static void main(String[] args) {
		ItemCreator creator;
		Item item;
		
		creator = new HpCreator();
		item = creator.create();
		
		item.use();
		
		creator = new MpCreator();
		item = creator.create();

		item.use();
	}

}
