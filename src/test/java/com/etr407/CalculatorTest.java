package com.etr407;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();
		assertEquals(3, calculator.add(1,2));
	}

}
