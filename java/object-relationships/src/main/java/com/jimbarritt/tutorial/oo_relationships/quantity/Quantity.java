package com.jimbarritt.tutorial.oo_relationships.quantity;

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

}