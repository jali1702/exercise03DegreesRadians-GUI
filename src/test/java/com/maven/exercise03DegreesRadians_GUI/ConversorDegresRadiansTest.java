package com.maven.exercise03DegreesRadians_GUI;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConversorDegresRadiansTest {
	ConversorDegresRadians cdr = new ConversorDegresRadians();
	
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
		assertEquals(degrees2radians(3.8),cdr.convertDegreestToRadians(3.8),0.1);
	}

	@Test
	public void testMethodRadianstoDegrees() {
		assertEquals(radians2degrees(3.8),cdr.convertRadiansToDegrees(3.8),0.1);
	}


}