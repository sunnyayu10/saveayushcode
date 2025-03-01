package com.Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsExample {

	String environment="prod";
	
	@Test
	public void test1() {
		
		int result = CalculatorTest2.add(6, 7);
		
		Assumptions.assumeTrue(this.environment.equals("dev"));
		Assertions.assertEquals(13,result);
	}
	
	@Test
	public void test2() {
		
		int result = CalculatorTest2.add(6, 7);
		
		Assumptions.assumeFalse(this.environment.equals("dev"));
		Assertions.assertEquals(13,result);
	}

}
