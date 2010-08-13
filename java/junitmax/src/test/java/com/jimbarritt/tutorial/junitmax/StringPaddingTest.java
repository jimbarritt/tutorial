package com.jimbarritt.tutorial.junitmax;

import static com.jimbarritt.tutorial.junitmax.StringPadding.padStringLeft;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


import org.junit.Test;

public class StringPaddingTest {
	
	@Test
	public void padsAStringLeft() {
		String result = padStringLeft("123", 5);
		
		assertThat(result, is("  123"));
	}
	
	@Test
	public void doesNotPadStringWhichAreLongerThanRequired() {
		String result = padStringLeft("12345", 2);
		
		assertThat(result, is("12345"));
	}

}
