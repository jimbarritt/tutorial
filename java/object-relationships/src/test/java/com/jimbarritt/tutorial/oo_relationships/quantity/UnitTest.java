package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.centimetres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class UnitTest {

    @Test
    public void can_convert_centimetres_to_base_units() {
        assertThat(centimetres.convertTo(10.0, centimetres), is(new Quantity(10.0, centimetres)));
    }



}