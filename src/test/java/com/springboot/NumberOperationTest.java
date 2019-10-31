package com.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class NumberOperationTest {
	
	@Test
	public void testWhenISendOnceFortyResponse() {
		int number  = 40;
		String response = NumberOperation.transformNumberToRoman(number);
		assertEquals("XL", response);
	}
	
	@Test
	public void testWhenISendOnceFourThousandResponse(){
		int number  = 4000;
		String response = NumberOperation.transformNumberToRoman(number);
		assertEquals("MMMM", response);
	}
		
	@Test
	public void testWhenTheNumberIsOutOfRangeResponseFalse() {
		String number  = "-2";
		boolean response = NumberOperation.validateNumber(number);
		assertEquals(false, response);
	}
	
	@Test
	public void testWhenTheRequestIsAStringResponseFalse(){
		String number  = "A";
		boolean response = NumberOperation.validateNumber(number);
		assertEquals(false, response);
	}
	
	@Test
	public void testWhenISendANumberResponseIsTrue(){
		String number  = "10";
		boolean response = NumberOperation.validateNumber(number);
		assertEquals(true, response);
	}
	
	@Test
	public void testWhenISendANumberResponseIsFalse(){
		String number  = "A";
		boolean response = NumberOperation.isNumber(number);
		assertEquals(false, response);
	}
	
	

}
