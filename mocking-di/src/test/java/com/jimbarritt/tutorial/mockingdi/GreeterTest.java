package com.jimbarritt.tutorial.mockingdi;

import org.junit.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

/**
 * Need a better example, the GreetingService wasn't real enough from some people
 */
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