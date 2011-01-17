package com.jimbarritt.tutorial.oo_relationships.quantity;

public class Unit {

    public static final Unit centimetres = new Unit("centimetres");
    public static final Unit metres = new Unit("metres", centimetres, 100);

    public static final Unit millilitres = new Unit("millilitres");
    public static final Unit litres = new Unit("litres", millilitres, 1000);

    private double conversionFactor;
    private String name;
    private Unit baseUnits;


    private Unit(String name) {
        this(name, null, 0);
    }

    private Unit(String name, Unit baseUnits, double conversionFactor) {
        this.name = name;
        this.baseUnits = baseUnits;
        this.conversionFactor = conversionFactor;
    }

    public QuantityConverter convert(double amount) {
        return new QuantityConverter(amount, this);
    }

    public String toString() {
        return name;
    }

    Quantity convertTo(double amount, Unit newUnits) {
        if (this == newUnits) {
            return new Quantity(amount, this);
        }

        if (this.isNotCompatibleWith(newUnits)) {
            throw new CannotConvertUnitsException(this, newUnits);
        }

        double amountInBaseUnits = toBaseUnitAmount(amount);
        double amountInNewUnits = newUnits.fromBaseAmount(amountInBaseUnits);

        return new Quantity(amountInNewUnits, newUnits);
    }

    private boolean isNotCompatibleWith(Unit newUnits) {
        if (isBaseUnit()) {
            return name.equals(newUnits.baseUnits.name);
        }
        return baseUnits.equals(newUnits.baseUnits);
    }

    private double toBaseUnitAmount(double amount) {
        if (conversionFactor == 0) {
            return amount;
        }
        return amount * conversionFactor;
    }

    private double fromBaseAmount(double amountInBaseUnits) {
        if (conversionFactor == 0) {
            return amountInBaseUnits;
        }
        return amountInBaseUnits / conversionFactor;
    }

    private boolean isBaseUnit() {
        return this.baseUnits == null;
    }
}