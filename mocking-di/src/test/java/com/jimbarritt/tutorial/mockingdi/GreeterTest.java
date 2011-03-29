package com.jimbarritt.tutorial.mockingdi;

import org.junit.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GreeterTest {

    @Test
    public void says_hello_to_jim() {
        Greeter greeter = new Greeter();
        String message = greeter.sayHelloTo("Jim");
        assertThat(message, is("Hello 'Jim'"));
    }
}