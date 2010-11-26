package org.jimbarritt.tutorial.java101;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;


public class GreeterTest {

	@Test
	public void saysHelloToJim() {		
		Greeter greeter = new Greeter();
		
		String greeting = greeter.hello("Jim");
		
		assertThat(greeting, is("Hello 'Jim'"));
	}
	
}
