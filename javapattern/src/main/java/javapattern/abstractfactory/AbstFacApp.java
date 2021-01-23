package javapattern.abstractfactory;

import javapattern.abstractfactory.abst.BikeFactory;
import javapattern.abstractfactory.abst.Body;
import javapattern.abstractfactory.abst.Wheel;
import javapattern.abstractfactory.gt.GtFactory;
import javapattern.abstractfactory.sam.SamFactory;

public class AbstFacApp {

	public static void main(String[] args) {
		BikeFactory factory = new SamFactory();
		Body body = factory.createBody();
		Wheel wheel = factory.createWheel();

		System.out.println(body.getClass());
		System.out.println(wheel.getClass());
		
		System.out.println();
		
		BikeFactory factory2 = new GtFactory();
		Body body2 = factory2.createBody();
		Wheel wheel2 = factory2.createWheel();

		System.out.println(body2.getClass());
		System.out.println(wheel2.getClass());
	}

}
