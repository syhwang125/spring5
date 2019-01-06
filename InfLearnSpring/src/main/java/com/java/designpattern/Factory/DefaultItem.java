package com.java.designpattern.Factory;

import com.java.designpattern.Factory.framework.Item;

public class DefaultItem  extends Item {

		private String itemName;
		
		public DefaultItem(String itemName) {
			this.itemName = itemName;
		}
		
		@Override
		public void use() {
			System.out.println(itemName +" 사용했습니다!");
		}
}
