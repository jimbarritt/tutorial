package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.metres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthTest {


    @Test
    @Ignore("Waiting to implement equality")
    public void ten_centimetres_is_one_tenth_of_a_metre() {
        Length tenCentimetres = new Length(10, centimetres);
        Length oneTenthOfAMetre = new Length(0.1, metres);

        assertThat(tenCentimetres, is(oneTenthOfAMetre));
    }

}