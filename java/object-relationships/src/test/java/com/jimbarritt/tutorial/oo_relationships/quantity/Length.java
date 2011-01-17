package com.jimbarritt.tutorial.oo_relationships.quantity;


public class Length {

    private final double value;
    private final DistanceUnit distanceUnit;

    public Length(double value, DistanceUnit distanceUnit) {
        this.value = value;
        this.distanceUnit = distanceUnit;
    }
}