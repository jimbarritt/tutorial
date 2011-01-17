package com.jimbarritt.tutorial.oo_relationships.length;

import static com.jimbarritt.tutorial.oo_relationships.length.Length.lengthOf;

public enum DistanceUnit {

    centimetres(1),
    metres(100);

    private final double toCentimetresFactor;

    DistanceUnit(double toCentimetresFactor) {
        this.toCentimetresFactor = toCentimetresFactor;
    }

    public Length toCentimetres(Length length) {
        return lengthOf(length.doubleValue() * toCentimetresFactor, centimetres);
    }
}