package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.metres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DistanceUnitTest {

    @Test
    public void converts_metres_to_centimetres() {
        assertThat(10.0, is(metres.convertToCentimetres(0.1)));
    }

    @Test
    public void converts_centimetres_to_centimetres() {
        assertThat(10.0, is(centimetres.convertToCentimetres(10.0)));
    }

}