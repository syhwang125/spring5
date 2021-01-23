package javapattern.abstractfactory.gt;

import javapattern.abstractfactory.abst.BikeFactory;
import javapattern.abstractfactory.abst.Body;
import javapattern.abstractfactory.abst.Wheel;

public class GtFactory implements BikeFactory {

	@Override
	public Body createBody() {
		
		return new GtBody();
	}

	@Override
	public Wheel createWheel() {
		
		return new GtWheel();
	}

	
}
