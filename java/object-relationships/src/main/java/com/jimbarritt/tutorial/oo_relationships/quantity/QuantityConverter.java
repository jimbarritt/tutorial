package com.jimbarritt.tutorial.oo_relationships.quantity;

public class QuantityConverter {
    private final double amount;
    private final Unit originalUnits;

    public QuantityConverter(double amount, Unit originalUnits) {
        this.amount = amount;
        this.originalUnits = originalUnits;
    }

    public Quantity to(Unit newUnits) {
        return originalUnits.convertTo(amount, newUnits);
    }
}