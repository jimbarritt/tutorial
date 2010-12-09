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
		String message = greeter.sayHelloTo("Jim");
		
		assertThat(message, is("Hello Jim"));
	}
	
	@Test
	public void says_hello_to_dunc() {				
		String message = greeter.sayHelloTo("Dunc");
		
		assertThat(message, is("Hello Dunc"));
	}
	
	@Test
	public void says_hello_to_jim_and_dunc() {
		String message = greeter.sayHelloTo("Jim", "Dunc");
		
		assertThat(message, is("Hello Jim Dunc"));
	}
	
	@Test
	@Ignore("Work in progress")
	public void sends_email_to_jim() {		
		greeter.sendEmailTo("jim@planet-ix.com", "Hello Jim Via Email");
		
		Email email = mailClient.getLastEmail();
		String subjectBody = email.getSubject();
		assertThat(subjectBody, is("Hello Jim Via Email"));
	}
		
}
