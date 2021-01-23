package javapattern.abstfactory;

import javapattern.abstfactory.abst.Button;
import javapattern.abstfactory.abst.GuiFac;
import javapattern.abstfactory.abst.TextArea;
import javapattern.abstfactory.concrete.FactoryInstance;
import javapattern.abstfactory.linux.LinuxGuiFac;
import javapattern.abstfactory.mac.MacGuiFac;
import javapattern.abstfactory.win.WinGuiFac;

public class AbstFactoryApp {

	public static void main(String[] args) {
		
		GuiFac fac = FactoryInstance.getGuiFac();
		
		GuiFac linuxFac = new LinuxGuiFac();

		Button button = linuxFac.createButton();
		TextArea textArea = linuxFac.createTextArea();
		button.click();

		System.out.println(textArea.getText());

		GuiFac macFac = new MacGuiFac();

		Button button2 = macFac.createButton();
		TextArea textArea2 = macFac.createTextArea();
		button2.click();

		System.out.println(textArea2.getText());

		GuiFac winFac = new WinGuiFac();

		Button button3 = winFac.createButton();
		TextArea textArea3 = winFac.createTextArea();
		button3.click();

		System.out.println(textArea3.getText());

	}

}
