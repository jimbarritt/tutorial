package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.metres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.Length.lengthOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class DistanceUnitTest {

    @Test
    public void converts_metres_to_centimetres() {
        assertThat(metres.toCentimetres(lengthOf(0.1, metres)), is(lengthOf(10.0, centimetres)));
    }

    @Test
    public void converts_centimetres_to_centimetres() {
        assertThat(centimetres.toCentimetres(lengthOf(10.0, centimetres)), is(lengthOf(10.0, centimetres)));
    }

}