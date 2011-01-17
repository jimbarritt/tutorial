package com.jimbarritt.tutorial.oo_relationships.quantity;


import static com.jimbarritt.tutorial.oo_relationships.quantity.DistanceUnit.centimetres;

public class Length {

    private final double value;
    private final DistanceUnit distanceUnit;

    public Length(double value, DistanceUnit distanceUnit) {
        this.value = value;
        this.distanceUnit = distanceUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        if (Double.compare(this.asCentimetres(), length.asCentimetres()) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
        result = (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override public String toString() {
        return "Length{" +
                "value=" + value +
                ", distanceUnit=" + distanceUnit +
                '}';
    }

    private double asCentimetres() {
        return this.distanceUnit.convertToCentimetres(this.value);
    }
}