package com.jimbarritt.tutorial.oo_relationships.length;


import static com.jimbarritt.tutorial.oo_relationships.length.DistanceUnit.centimetres;

public class Length {

    private final double value;
    private final DistanceUnit distanceUnit;

    public static Length lengthOf(double value, DistanceUnit distanceUnit) {
        return new Length(value, distanceUnit);
    }

    public Length(double value, DistanceUnit distanceUnit) {
        this.value = value;
        this.distanceUnit = distanceUnit;
    }

    @Override
    public boolean equals(Object o) {
        Length length = (Length) o;
        if (this.distanceUnit == centimetres && length.distanceUnit == centimetres) {
            return (Double.compare(this.value, length.value) == 0);
        }
        return this.asCentimetres().equals(length.asCentimetres());
    }

    @Override
    public int hashCode() {
        if (this.distanceUnit == centimetres) {
            long temp = value != +0.0d ? Double.doubleToLongBits(value) : 0L;
            return (int) (temp ^ (temp >>> 32));
        }
        return this.asCentimetres().hashCode();
    }

    @Override public String toString() {
        return "Length{" +
                "value=" + value +
                ", distanceUnit=" + distanceUnit +
                '}';
    }

    private Length asCentimetres() {
        return this.distanceUnit.toCentimetres(this);
    }

    double doubleValue() {
        return value;
    }
}