package com.jimbarritt.tutorial.oo_relationships.quantity;

public enum Unit {

    centimetres,
    metres;

    public QuantityConverter convert(double amount) {
        return new QuantityConverter(amount, this);
    }
}