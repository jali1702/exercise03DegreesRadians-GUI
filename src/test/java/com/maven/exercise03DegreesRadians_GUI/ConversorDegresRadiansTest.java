package com.maven.exercise03DegreesRadians_GUI;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class ConversorDegresRadiansTest {
	ConversorDegresRadians cdr = new ConversorDegresRadians();
	Random random = new Random();
	private static final Logger LOG = Logger.getLogger(ConversorDegresRadians.class.getName());
	
	//implement the conversion in another way
	// compare the result of the two implementations.
	
	public double degrees2radians(double valueInDegrees) {
		double radians = valueInDegrees *(Math.PI/180);
		return radians;
	}
	public double radians2degrees(double valueInRadians) {
		double degrees = valueInRadians *(180/Math.PI);
		return degrees;
	}
	@Test
	public void testMethodDegreestoRadians() {
		double randomValue= 0.0;
		for (int i = 0; i < 10; i++) {
			randomValue = random.nextDouble()*100;
			LOG.info("Testing the method ConvertDegresToRadians with value: " + randomValue);
			assertEquals(degrees2radians(randomValue),cdr.convertDegreestToRadians(randomValue),0.1);
		}
	}

	@Test
	public void testMethodRadianstoDegrees() {
		double randomValue= 0.0;
		for (int i = 0; i < 10; i++) {
			randomValue = random.nextDouble()*100;
			LOG.info("Testing the method ConvertRadiansToDegres with value: " + randomValue);
			assertEquals(radians2degrees(randomValue),cdr.convertRadiansToDegrees(randomValue),0.1);
	}



}
}