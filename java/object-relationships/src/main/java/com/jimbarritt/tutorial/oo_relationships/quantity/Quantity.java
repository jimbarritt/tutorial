package com.jimbarritt.tutorial.oo_relationships.quantity;

import static java.lang.Math.*;

public class Quantity {
    private double amount;
    private Unit units;

    public Quantity(double amount, Unit units) {
        this.amount = amount;
        this.units = units;
    }

    public String toString() {
        return String.format("%s %s", amount, units);
    }

    private Quantity to(Unit newUnits) {
        return units.convert(amount).to(newUnits);
    }

    public boolean equals(Object o) {
        Quantity otherQuantity = (Quantity) o;
        Quantity otherQuantityInSameUnits = otherQuantity.to(units);

        if (abs(this.amount - otherQuantityInSameUnits.amount) > 0.0000001) {
            return false;
        }

        return true;
    }

}