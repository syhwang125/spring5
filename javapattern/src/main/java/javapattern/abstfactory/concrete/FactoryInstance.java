package javapattern.abstfactory.concrete;

import javapattern.abstfactory.abst.GuiFac;
import javapattern.abstfactory.linux.LinuxGuiFac;
import javapattern.abstfactory.mac.MacGuiFac;
import javapattern.abstfactory.win.WinGuiFac;

public class FactoryInstance {

	public static GuiFac getGuiFac() {
		
		switch(getOsCode()) {
		case 0 : 
			return new MacGuiFac();
		case 1 : 
			return new LinuxGuiFac();
		case 2 : 
			return new WinGuiFac();
		}
		return null;
	}
	
	public static int getOsCode() {
		if(System.getProperty("os.name").equals("Mac OS X")) {
			return 0;
		} else {
			return 1;
		}
	}
}
