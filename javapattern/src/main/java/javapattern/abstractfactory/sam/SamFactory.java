package javapattern.abstractfactory.sam;

import javapattern.abstractfactory.abst.BikeFactory;
import javapattern.abstractfactory.abst.Body;
import javapattern.abstractfactory.abst.Wheel;

public class SamFactory implements BikeFactory {

	@Override
	public Body createBody() {
		
		return new SamBody();
	}

	@Override
	public Wheel createWheel() {
		
		return new SamWheel();
	}

	
}
