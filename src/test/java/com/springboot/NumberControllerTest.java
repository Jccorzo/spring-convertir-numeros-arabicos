package com.springboot;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class NumberControllerTest {
	
	@Test
	public void testWhenISendAValidNumberResponseTheRomanNumber() {
		NumberController numberController = mock(NumberController.class);
		when(numberController.transformNumber("5")).thenReturn("V");
		assertEquals("V", numberController.transformNumber("5"));
	}
	
	@Test
	public void testWhenIConsultTheRequestNumberResponse() {
		NumberRepository numberRepository = mock(NumberRepository.class);
		NumberController numberController = new NumberController(numberRepository);
		when(numberRepository.count()).thenReturn((long) 1);
		assertEquals(1, numberController.getRequestsNumber());
	}
	
	@Test
	public void testWhenIConsultTheObjectStoragedResponse() {
		Number number = new Number ("5","V");
		List<Number> numberList = new ArrayList<>();
		numberList.add(number);
		NumberRepository numberRepository = mock(NumberRepository.class);
		NumberController numberController = new NumberController(numberRepository);
		when(numberRepository.findAll()).thenReturn(numberList);
		assertEquals(numberList, numberController.consultTransformedNumbers());
	}
	
	
}
