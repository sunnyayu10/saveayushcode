package com.Junits;

import java.util.Arrays;
import java.util.Collection;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.Assertions;

public class DynamicTestExample {

	@TestFactory
	public Collection<DynamicTest> testcases() {
		
		return Arrays.asList(
				
				DynamicTest.dynamicTest("Positive Testcase to check palindrome", 
						 () -> Assertions.assertTrue(StringFunctions.isPallindrom("madam"))),
				
				DynamicTest.dynamicTest("Negative Testcase to check palindrome", 
						 () -> Assertions.assertFalse(StringFunctions.isPallindrom("nikunj")))
				
				
				);
		
	}

}

