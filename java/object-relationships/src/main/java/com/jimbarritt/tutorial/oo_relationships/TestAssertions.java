package com.jimbarritt.tutorial.oo_relationships;

import org.junit.*;

import java.util.*;

import static java.util.Arrays.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class TestAssertions {

    @Test
    public void shouldDemoAssertions() throws Exception {
        assertThat(4, is(4));
        assertThat("hamburger".substring(0, 3), is("ham"));
        assertThat("foobar", containsString("bar"));
		assertThat(asList(1, 2, 3), containsInAnyOrder(4));
        assertThat((Collection)asList(1, 2, 3), hasSize(3));
        assertThat(asList("a", "b", "c"), hasItem("b"));
        assertThat(asList("a", "b", "c"), not(hasItem("x")));
    }

}