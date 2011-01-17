package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.centimetres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class QuantityTest {

    @Test
    public void ten_centimetres_equals_ten_centimetres() {
        Quantity tenCentimetres = new Quantity(10, centimetres);
        Quantity oneTenthOfAMetre = new Quantity(10, centimetres);

        assertThat(tenCentimetres, is(oneTenthOfAMetre));
    }



}