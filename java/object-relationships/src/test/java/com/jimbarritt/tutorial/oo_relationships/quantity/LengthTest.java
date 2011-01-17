package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.metres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LengthTest {

    @Test
    public void ten_centimetres_is_ten_centimetres() {
        assertThat(new Length(10, centimetres), is(new Length(10, centimetres)));
    }

    @Test
    public void ten_centimetres_is_one_tenth_of_a_metre() {
        Length tenCentimetres = new Length(10, centimetres);
        Length oneTenthOfAMetre = new Length(0.1, metres);

        assertThat(tenCentimetres, is(oneTenthOfAMetre));
    }

}