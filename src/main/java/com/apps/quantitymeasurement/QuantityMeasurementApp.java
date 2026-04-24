package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // Generic equality method
    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    // Feet equality
    public static void demonstrateFeetEquality() {
        Length f1 = new Length(5.0, Length.LengthUnit.FEET);
        Length f2 = new Length(5.0, Length.LengthUnit.FEET);

        System.out.println("Feet Equal: " + f1.equals(f2));
    }

    // Inches equality
    public static void demonstrateInchesEquality() {
        Length i1 = new Length(10.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(10.0, Length.LengthUnit.INCHES);

        System.out.println("Inches Equal: " + i1.equals(i2));
    }

    // Cross comparison
    public static void demonstrateFeetInchesComparison() {
        Length f = new Length(1.0, Length.LengthUnit.FEET);
        Length i = new Length(12.0, Length.LengthUnit.INCHES);

        System.out.println("1 ft == 12 in: " + f.equals(i));
    }

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
        demonstrateFeetInchesComparison();
    }
}