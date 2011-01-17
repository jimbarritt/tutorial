package com.jimbarritt.tutorial.oo_relationships.quantity;

import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.centimetres;
import static com.jimbarritt.tutorial.oo_relationships.quantity.Unit.metres;

public class QuantityConverter {
    private final double amount;
    private final Unit baseUnits;

    public QuantityConverter(double amount, Unit baseUnits) {
        this.amount = amount;
        this.baseUnits = baseUnits;
    }

    public Quantity to(Unit newUnits) {
        if (baseUnits == newUnits) {
            return new Quantity(amount, baseUnits);
        }

        if (baseUnits == metres && newUnits == centimetres) {
            return new Quantity(amount * 100, centimetres);
        }

        throw new CannotConvertUnitsException(baseUnits, newUnits);
    }
}