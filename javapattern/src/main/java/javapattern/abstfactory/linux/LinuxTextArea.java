package javapattern.abstfactory.linux;

import javapattern.abstfactory.abst.TextArea;

public class LinuxTextArea implements TextArea {

	@Override
	public String getText() {
		return "Linux textarea";
	}

}
