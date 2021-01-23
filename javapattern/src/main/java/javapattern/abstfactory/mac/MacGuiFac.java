package javapattern.abstfactory.mac;

import javapattern.abstfactory.abst.Button;
import javapattern.abstfactory.abst.GuiFac;
import javapattern.abstfactory.abst.TextArea;

public class MacGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public TextArea createTextArea() {
		return new MacTextArea();
	}

}
