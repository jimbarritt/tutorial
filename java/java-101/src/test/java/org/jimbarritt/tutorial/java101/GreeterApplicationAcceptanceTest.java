package org.jimbarritt.tutorial.java101;

import org.junit.Test;


public class GreeterApplicationAcceptanceTest {

	@Test
	public void saysHelloToDuncAndMahesh() {
		
		GreeterApplication.main(new String[] {"Dunc", "Mahesh"});
		
		// todo assert something about system.out
	}
}
