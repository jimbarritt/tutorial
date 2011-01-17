package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.litres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.millilitres;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class VolumeTest {

    @Test
    public void ten_millilitres_equals_one_hundredth_of_a_litre() {
        assertThat(new Quantity(10, millilitres), is(new Quantity(0.01, litres)));
    }

}