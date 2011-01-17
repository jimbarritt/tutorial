package com.jimbarritt.tutorial.oo_relationships.quantity;

public enum DistanceUnit {

    centimetres(1), metres(100);

    private final double toCentimetresFactor;

    DistanceUnit(double toCentimetresFactor) {
        this.toCentimetresFactor = toCentimetresFactor;
    }

    public double convertToCentimetres(double value) {
        return value * toCentimetresFactor;
    }
}