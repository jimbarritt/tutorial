package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.centimeters;
import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.meters;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthTest {


    @Test
    @Ignore("Waiting to implement equality")
    public void ten_centimetres_is_one_tenth_of_a_metre() {
        Length tenCentimetres = new Length(10, centimeters);
        Length oneTenthOfAMetre = new Length(0.1, meters);

        assertThat(tenCentimetres, is(oneTenthOfAMetre));
    }

}