package com.kazhian.learn;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class HelloServiceTest {
	@Test
	public void should_return_hello() {
		// Given
		Hello service = new Hello();
		String expected = "Good Morning";
		
		// When
		String message = service.getMessage();
		
		// Then
		Assertions.assertThat(message).isEqualTo(expected);
	}

	@Test
	public void should_return_id() {
		// Given
		Hello service = new Hello();
		Integer expected = 2073333;
		
		// When
		Integer actual = service.getId();
		
		// Then
		Assertions.assertThat(actual).isEqualTo(expected);
	}
}
