package com.apps.quantitymeasurement;

public class Length {

    // Instance variables
    private double value;
    private LengthUnit unit;

    // Enum with conversion to base unit (inches)
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

    // Constructor
    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit (inches)
    private double convertToBaseUnit() {
        double result = this.value * this.unit.getConversionFactor();
        return Math.round(result * 100.0) / 100.0; // round to 2 decimal places
    }

    // Compare two Length objects
    public boolean compare(Length that) {
        return Double.compare(
                this.convertToBaseUnit(),
                that.convertToBaseUnit()
        ) == 0;
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;
        return this.compare(other);
    }
}