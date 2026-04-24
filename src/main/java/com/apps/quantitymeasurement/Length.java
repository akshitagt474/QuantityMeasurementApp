package com.apps.quantitymeasurement;

public class Length {

    // Instance variables
    private double value;
    private LengthUnit unit;

    // Enum (base unit = inches)
    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

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
        return this.value * this.unit.getConversionFactor();
    }

    // Compare two lengths
    public boolean compare(Length thatLength) {
        return Double.compare(
                this.convertToBaseUnit(),
                thatLength.convertToBaseUnit()
        ) == 0;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Length other = (Length) obj;
        return this.compare(other);
    }

    // Main (for quick check)
    public static void main(String[] args) {
        Length l1 = new Length(1.0, LengthUnit.FEET);
        Length l2 = new Length(12.0, LengthUnit.INCHES);

        System.out.println("Are equal? " + l1.equals(l2)); // true
    }
}
