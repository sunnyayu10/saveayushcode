package com.Junits;

import java.time.Month;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterExample {

	@ParameterizedTest
	@ValueSource(strings= {"mom","dad","radar"})
	public void palindromCheck(String str) {
		Assertions.assertTrue(StringFunctions.isPallindrom(str));
	}
	
	
	@ParameterizedTest
	@ValueSource(ints= {2,6,53,78})
	public void evenNumCheck(int num) {
		Assertions.assertTrue(num%2==0);
	}
	
	@ParameterizedTest
	@EnumSource(Month.class)
	public void MonthCheck(Month monthname) {
		
		//System.out.println(monthname.name() + " " + monthname.length(false));
		
		Assertions.assertTrue(monthname.length(false)==30 || monthname.length(false)==31 || monthname.length(true)==29);	
	// true is given for leap year and false for other year , if given true = 28 and feb will fail
	}
	
	@ParameterizedTest
	@MethodSource("DataProvider")
	public void PalindromeCheck1(String str) {
		
		Assertions.assertTrue(StringFunctions.isPallindrom(str));
			
	}
	
	static Stream<String> DataProvider(){
		
		return Stream.of("racecar", "radar", "mom", "dad");
		
	}
}
