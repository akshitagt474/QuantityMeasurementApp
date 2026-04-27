package com.apps.quantitymeasurement;

public class Length {

    private double value;
    private LengthUnit unit;

    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to base (inches)
    private double convertToBaseUnit() {
        double inches = this.value * this.unit.getConversionFactor();
        return Math.round(inches * 100.0) / 100.0;
    }

    // Compare
    private boolean compare(Length that) {
        return Double.compare(
                this.convertToBaseUnit(),
                that.convertToBaseUnit()
        ) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length other = (Length) o;
        return compare(other);
    }

    // 🔥 UC5: Convert to another unit
    public Length convertTo(LengthUnit targetUnit) {

        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }

        // Step 1: convert to inches
        double baseValue = convertToBaseUnit();

        // Step 2: convert inches → target unit
        double converted = baseValue / targetUnit.getConversionFactor();

        // Step 3: round
        converted = Math.round(converted * 100.0) / 100.0;

        return new Length(converted, targetUnit);
    }

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }
}