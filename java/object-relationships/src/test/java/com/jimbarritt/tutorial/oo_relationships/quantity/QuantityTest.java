package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.metres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class QuantityTest {

    private static final Quantity TEN_CENTIMETRES = new Quantity(10, centimetres);
    private static final Quantity TWENTY_CENTIMETRES = new Quantity(20, centimetres);

    private static final Quantity TEN_METRES = new Quantity(10, metres);
    private static final Quantity ONE_TENTH_OF_A_METRE = new Quantity(0.1, metres);

    @Test
    public void ten_centimetres_equals_ten_centimetres() {
        assertThat(TEN_CENTIMETRES, is(ONE_TENTH_OF_A_METRE));
    }

    @Test
    public void ten_centimetres_does_not_equal_twenty_centimetres() {
        assertThat(TEN_CENTIMETRES, is(not(TWENTY_CENTIMETRES)));
    }

    @Test
    public void ten_centimetres_does_not_equal_ten_metres() {
        assertThat(TEN_CENTIMETRES, is(not(TEN_METRES)));
    }

    @Test
    public void ten_centimetres_equals_one_tenth_of_a_metre() {
        assertThat(TEN_CENTIMETRES, is(ONE_TENTH_OF_A_METRE));
    }

    @Test
    public void renders_as_string() {
        String representaion = TEN_CENTIMETRES.toString();

        assertThat(representaion, containsString("10"));
        assertThat(representaion, containsString(metres.toString()));

    }

}