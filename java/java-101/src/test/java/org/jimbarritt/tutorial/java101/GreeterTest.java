package org.jimbarritt.tutorial.java101;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class GreeterTest {
	
	private Greeter greeter;
	private MailClient mailClient;
	
	@Before
	public void onceBeforeEachTest() {
		greeter = new Greeter();
	}
	
	@After
	public void onceAfterEachTest() {
		greeter = null;
	}

	@Test
	public void says_hello_to_jim() {				
		String greeting = greeter.sayHelloTo("Jim");
		
		assertThat(greeting, is("Hello Jim"));
	}
	
	@Test
	public void says_hello_to_dunc() {				
		String greeting = greeter.sayHelloTo("Dunc");
		
		assertThat(greeting, is("Hello Dunc"));
	}
	
	@Test
	@Ignore("Work in progress")
	public void sends_email_to_jim() {
		
		greeter.sendEmailTo("jim@planet-ix.com", "Hello Jim Via Email");
		
		Email email = mailClient.getLastEmail();
		String messageBody = email.getMessageBody();
		assertThat(messageBody, is("Hello Jim Via Email"));
	}
		
}
