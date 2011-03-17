package com.bhaisahab;

import org.junit.*;

import static junit.framework.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FibonacciTest {

    @Test
    public void returnsOneWhenPassedZero() {
        assertThat(new Fibonacci().position(0), is(0));
    }

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

    @Test
    public void returnsThreeWhenFour() {
        assertThat(new Fibonacci().position(4), is(3));
    }

    @Test
    public void returnsFiveWhenFive() {
        assertThat(new Fibonacci().position(5), is(5));
    }


}