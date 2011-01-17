package com.jimbarritt.tutorial.oo_relationships.length;

import org.junit.*;

import java.util.*;

import static com.jimbarritt.tutorial.oo_relationships.length.DistanceUnit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.length.DistanceUnit.metres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
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

        assertThat(tenCentimetres, is(equalTo(oneTenthOfAMetre)));
    }

    @Test
    public void hashcode_works_with_same_units() {

        Set<Length> lengths = new HashSet<Length>();

        lengths.add(new Length(10, centimetres));
        lengths.add(new Length(10, centimetres));
        lengths.add(new Length(20, centimetres));

        assertThat(lengths.size(), is(2));
    }

    @Test
    public void hashcode_works_with_different_units() {

        Set<Length> lengths = new HashSet<Length>();

        lengths.add(new Length(10, centimetres));
        lengths.add(new Length(0.1, metres));

        assertThat(lengths.size(), is(1));
    }

}