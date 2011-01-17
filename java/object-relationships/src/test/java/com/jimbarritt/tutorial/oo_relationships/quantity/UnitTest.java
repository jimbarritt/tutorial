package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class UnitTest {

    @Test
    public void can_convert_centimetres_to_base_units() {
        assertThat(centimetres.convertTo(centimetres, 10.0), is(new Quantity(10.0, centimetres)));
    }

    @Test
    public void can_convert_metres_to_base_units() {
        assertThat(centimetres.convertTo(metres, 1.0), is(new Quantity(0.01, metres)));
    }



}