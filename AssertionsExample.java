package com.Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsExample {

	@Test
	public void assertingExample() {
		
	String str1 = "simple";
	String str2 = "simple";
	String str3 = "oxford";
	
	Assertions.assertEquals(str1, str2);
	Assertions.assertNotEquals(str2, str3);
	
	String str4 = null;
	Assertions.assertNull(str4);
	Assertions.assertNotNull(str3);
	
	int i = 10;
	int j= 8;
	Assertions.assertTrue(i>j);
	

	}
}
