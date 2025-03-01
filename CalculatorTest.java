package com.Junits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
		
		@Test
		public void test1() {
			int result = CalculatorTest2.add(6, 7);
			Assertions.assertEquals(13,result);

			}

		@Test
		@Tag("Sanity")
		
		public void test2() {
			int result = CalculatorTest2.sub(8, 6);
			Assertions.assertEquals(14,result);
		}
	}


