package com.apps.quantitymeasurement;

public class QuantityMeasurementApp {

    // Equality
    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    // Comparison
    public static boolean demonstrateLengthComparison(
            double v1, Length.LengthUnit u1,
            double v2, Length.LengthUnit u2) {

        Length l1 = new Length(v1, u1);
        Length l2 = new Length(v2, u2);

        return l1.equals(l2);
    }

    // 🔥 UC5: Conversion (primitive input)
    public static Length demonstrateLengthConversion(
            double value,
            Length.LengthUnit fromUnit,
            Length.LengthUnit toUnit) {

        Length length = new Length(value, fromUnit);
        return length.convertTo(toUnit);
    }

    // 🔥 UC5: Conversion (object input)
    public static Length demonstrateLengthConversion(
            Length length,
            Length.LengthUnit toUnit) {

        return length.convertTo(toUnit);
    }

    public static void main(String[] args) {

        Length result1 = demonstrateLengthConversion(
                3.0, Length.LengthUnit.FEET, Length.LengthUnit.INCHES);

        System.out.println("3 feet → inches = " + result1);

        Length yard = new Length(2.0, Length.LengthUnit.YARDS);
        Length result2 = demonstrateLengthConversion(
                yard, Length.LengthUnit.INCHES);

        System.out.println("2 yards → inches = " + result2);
    }
}