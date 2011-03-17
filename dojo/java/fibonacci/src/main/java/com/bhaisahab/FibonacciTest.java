package com.bhaisahab;

import org.junit.*;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FibonacciTest {

    @Test
    public void returnsOneWhenPassedOne() {
        assertThat(new Fibonacci().position(1), is(1));
    }

    @Test
    public void returnsOneWhenTwo(){
        assertThat(new Fibonacci().position(2), is(1));
    }

    @Test
    public void returnsTwoWhenThree() {
        assertThat(new Fibonacci().position(3), is(2));
    }
}