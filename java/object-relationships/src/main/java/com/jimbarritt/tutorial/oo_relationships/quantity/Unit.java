package com.jimbarritt.tutorial.oo_relationships.quantity;

public enum Unit {

    centimetres,
    metres(centimetres, 100),
    millilitres,
    litres;


    private Unit() {

    }

    private Unit(Unit baseUnit, double conversionFactor) {

    }

    public QuantityConverter convert(double amount) {
        return new QuantityConverter(amount, this);
    }

    public static class QuantityConverter {
            private final double amount;
            private final Unit originalUnits;

            public QuantityConverter(double amount, Unit originalUnits) {
                this.amount = amount;
                this.originalUnits = originalUnits;
            }

            public Quantity to(Unit newUnits) {
                if (originalUnits == newUnits) {
                    return new Quantity(amount, originalUnits);
                }

                if (originalUnits == metres && newUnits == centimetres) {
                    return new Quantity(amount * 100, newUnits);
                }

                if (originalUnits == litres && newUnits == millilitres) {
                    return new Quantity(amount * 1000, newUnits);
                }

                throw new CannotConvertUnitsException(originalUnits, newUnits);
            }
        }
}