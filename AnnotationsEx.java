package com.Junits;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class AnnotationsEx {

	@BeforeAll
	public static void method3() {
		
		System.out.println("This method will be called only once before all test cases");
	}
	
	
	@BeforeEach
	public void method1() {
		
		System.out.println("This method will be called before each test case");
	}
	
	
	@Test
	@DisplayName("Positive test scenario")
	public void test1() {
		
		Assertions.assertTrue(StringFunctions.isPallindrom("mom"));
			
	}
	
	@Test
	@Disabled  //In case we don't want to execute this test case
	@DisplayName("Negative test scenario")
	public void test2() {
		
		Assertions.assertFalse(StringFunctions.isPallindrom("vemu"));

	}
	
	@AfterEach
	public void method2() {
		
		System.out.println("This method will be called after each test case");
	}
	
	@AfterAll
	public static void method4() {
		
		System.out.println("This method will be called only once after all test cases");
	}

}


