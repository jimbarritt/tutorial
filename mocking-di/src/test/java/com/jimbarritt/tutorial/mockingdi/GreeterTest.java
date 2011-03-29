package com.jimbarritt.tutorial.mockingdi;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GreeterTest {
    @Test
    public void says_hello_to_jim() {
        GreetingService greetingService = mock(GreetingService.class);
        Greeter greeter = new Greeter(greetingService);

        when(greetingService.formatHelloMessageFor("Jim")).thenReturn("Hello 'Jim'");

        String message = greeter.sayHelloTo("Jim");
        assertThat(message, is("Hello 'Jim'"));
    }
}