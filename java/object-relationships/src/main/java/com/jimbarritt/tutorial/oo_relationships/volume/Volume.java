package com.jimbarritt.tutorial.oo_relationships.volume;

import java.text.*;

import static java.lang.String.*;

public class Volume {
    private final double value;
    private final UnitOfMeasure unitOfMeasure;

    public Volume(double value, UnitOfMeasure unitOfMeasure) {
        this.value = value;
        this.unitOfMeasure = unitOfMeasure;
    }

    public Volume in(UnitOfMeasure newUnitOfMeasure) {
        return newUnitOfMeasure.convert(value, unitOfMeasure);
    }

    public String toString() {
        return unitOfMeasure.toString(this);
    }

    public static abstract class UnitOfMeasure {

        private final DecimalFormat decimalFormat;
        private final String longName;
        private final String shortName;

        public UnitOfMeasure(DecimalFormat decimalFormat, String longName, String shortName) {
            this.decimalFormat = decimalFormat;
            this.longName = longName;
            this.shortName = shortName;
        }

        public abstract Volume convert(double value, UnitOfMeasure originalUnitOfMeasure);

        public String toString(Volume volume) {
            return decimalFormat.format(volume.value);
        }

        public String longName() {
            return longName;
        }

        public String shortName() {
            return shortName;
        }

        public static UnitOfMeasure LITRES = new UnitOfMeasure(new DecimalFormat("0.00"), "litres", "l") {
            @Override public Volume convert(double value, UnitOfMeasure originalUnitOfMeasure) {
                if (LITRES == originalUnitOfMeasure) {
                    return new Volume(value, originalUnitOfMeasure);
                }
                if (CC == originalUnitOfMeasure) {
                    return new Volume((value * 0.001), CC);
                }
                throw new VolumeConversionException(value, this);
            }
        };

        public static UnitOfMeasure CC = new UnitOfMeasure(new DecimalFormat("0"), "cubic centimetres", "cc") {
            @Override public Volume convert(double value, UnitOfMeasure originalUnitOfMeasure) {
                if (CC == originalUnitOfMeasure) {
                    return new Volume(value, originalUnitOfMeasure);
                }
                if (LITRES == originalUnitOfMeasure) {
                    return new Volume(value * 1000, CC);
                }
                throw new VolumeConversionException(value, this);
            }
        };

        private static class VolumeConversionException extends RuntimeException {
            public VolumeConversionException(double value, UnitOfMeasure unitOfMeasure) {
                super(format("Cannot Convert Volume %0.00f to units %s", value, unitOfMeasure.shortName()));
            }
        }
    }

}