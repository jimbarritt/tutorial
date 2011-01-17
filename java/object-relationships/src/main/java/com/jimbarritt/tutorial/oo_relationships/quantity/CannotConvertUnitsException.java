package com.jimbarritt.tutorial.oo_relationships.quantity;

import static java.lang.String.format;

public class CannotConvertUnitsException extends RuntimeException {
    public CannotConvertUnitsException(Unit originalUnits, Unit newUnits) {
        super(format("Cannot convert from %s to %s", originalUnits, newUnits));
    }
}