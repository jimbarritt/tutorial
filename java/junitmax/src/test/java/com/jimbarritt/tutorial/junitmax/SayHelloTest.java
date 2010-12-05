package com.jimbarritt.tutorial.junitmax;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class SayHelloTest {

	@Test
	public void saysHelloToThomas() {
		String response = new SayHelloThingy().sayHello("Thomas");		
		assertThat(response, is("Hello Thomas"));
	}
		
	@Test
	public void saysHelloToJim() {
		String response = new SayHelloThingy().sayHello("Jim");		
		assertThat(response, is("Hello Jim"));
	}
}
