package com.apps.quantitymeasurement;

/**
 * QuantityMeasurementApp – UC1: Feet measurement equality
 *
 * This class is responsible for checking the equality of two numerical values
 * measured in feet in the Quantity Measurement Application.
 */
public class QuantityMeasurementApp {

    // Inner class to represent Feet measurement
    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        /**
         * Override equals() method to compare two Feet objects based on their value
         *
         * Important Checks:
         * 1. Reference Check
         * 2. Null Check
         * 3. Type Check
         * 4. Value Comparison
         */
        @Override
        public boolean equals(Object obj) {

            // 1. Reference check
            if (this == obj)
                return true;

            // 2. Null check
            if (obj == null)
                return false;

            // 3. Type check
            if (getClass() != obj.getClass())
                return false;

            // 4. Value comparison
            Feet other = (Feet) obj;
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {

        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);
        Feet f3 = new Feet(6.0);

        System.out.println("Same Value: " + f1.equals(f2));       // true
        System.out.println("Different Value: " + f1.equals(f3));  // false

        Feet f4 = f1;
        System.out.println("Same Reference: " + f1.equals(f4));   // true

        System.out.println("Null Comparison: " + f1.equals(null)); // false
        System.out.println("Different Class: " + f1.equals("5.0")); // false
    }
}

