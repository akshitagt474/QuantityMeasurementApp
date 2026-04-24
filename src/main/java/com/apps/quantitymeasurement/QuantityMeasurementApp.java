package com.apps.quantitymeasurement;

/**
 * QuantityMeasurementApp – UC2: Inches measurement equality
 *
 * This class checks equality of values measured in feet and inches.
 */
public class QuantityMeasurementApp {

    // ===================== FEET CLASS =====================
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null)
                return false;

            if (getClass() != obj.getClass())
                return false;

            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ===================== INCHES CLASS =====================
    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj)
                return true;

            if (obj == null)
                return false;

            if (getClass() != obj.getClass())
                return false;

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ===================== DEMO METHODS =====================

    public static void demonstrateFeetEquality() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);
        Feet f3 = new Feet(6.0);

        System.out.println("Feet Same Value: " + f1.equals(f2));       // true
        System.out.println("Feet Different Value: " + f1.equals(f3));  // false
        System.out.println("Feet Null: " + f1.equals(null));           // false
        System.out.println("Feet Different Class: " + f1.equals("5")); // false
    }

    public static void demonstrateInchesEquality() {
        Inches i1 = new Inches(10.0);
        Inches i2 = new Inches(10.0);
        Inches i3 = new Inches(12.0);

        System.out.println("Inches Same Value: " + i1.equals(i2));       // true
        System.out.println("Inches Different Value: " + i1.equals(i3));  // false
        System.out.println("Inches Null: " + i1.equals(null));           // false
        System.out.println("Inches Different Class: " + i1.equals("10")); // false
    }

    // ===================== MAIN =====================

    public static void main(String[] args) {
        demonstrateFeetEquality();
        demonstrateInchesEquality();
    }
}