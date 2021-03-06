package com.jimbarritt.tutorial.oo_relationships.quantity;

import org.junit.*;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class QuantityConverterTest {

    @Test(expected = CannotConvertUnitsException.class)
    public void fails_if_try_to_convert_incompatible_units() {
        new QuantityConverter(20, Unit.centimetres).to(millilitres);
    }

    @Test
    public void converts_from_metres_to_centimetres() {
        Quantity convertedQuantity = new QuantityConverter(0.1, metres).to(centimetres);

        assertThat(convertedQuantity, is(new Quantity(10, centimetres)));
    }

    @Test
    public void converts_from_litres_to_millilitres() {
        Quantity convertedQuantity = new QuantityConverter(0.01, litres).to(millilitres);

        assertThat(convertedQuantity, is(new Quantity(10, millilitres)));
    }

}