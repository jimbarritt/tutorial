package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.metres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class QuantityTest {

    @Test
    public void ten_centimetres_equals_one_tenth_of_a_metre() {
        Quantity tenCentimetres = new Quantity(10, centimetres);
        Quantity oneTenthOfAMetre = new Quantity(0.1, metres);

        assertThat(tenCentimetres, is(oneTenthOfAMetre));
    }

}