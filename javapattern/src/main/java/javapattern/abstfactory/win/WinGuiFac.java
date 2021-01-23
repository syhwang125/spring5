package javapattern.abstfactory.win;

import javapattern.abstfactory.abst.Button;
import javapattern.abstfactory.abst.GuiFac;
import javapattern.abstfactory.abst.TextArea;

public class WinGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}
