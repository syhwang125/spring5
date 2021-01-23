package javapattern.abstfactory.linux;

import javapattern.abstfactory.abst.Button;
import javapattern.abstfactory.abst.GuiFac;
import javapattern.abstfactory.abst.TextArea;

public class LinuxGuiFac implements GuiFac {

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
