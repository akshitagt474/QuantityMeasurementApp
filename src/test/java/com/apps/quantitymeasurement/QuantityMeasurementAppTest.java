package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    // ================= BASIC EQUALITY =================

    @Test
    public void testFeetEquality() {
        assertEquals(
                new Length(1.0, Length.LengthUnit.FEET),
                new Length(1.0, Length.LengthUnit.FEET)
        );
    }

    @Test
    public void testInchesEquality() {
        assertEquals(
                new Length(10.0, Length.LengthUnit.INCHES),
                new Length(10.0, Length.LengthUnit.INCHES)
        );
    }

    @Test
    public void testFeetInchesComparison() {
        assertEquals(
                new Length(1.0, Length.LengthUnit.FEET),
                new Length(12.0, Length.LengthUnit.INCHES)
        );
    }

    // ================= INEQUALITY =================

    @Test
    public void testFeetInequality() {
        assertNotEquals(
                new Length(1.0, Length.LengthUnit.FEET),
                new Length(2.0, Length.LengthUnit.FEET)
        );
    }

    @Test
    public void testInchesInequality() {
        assertNotEquals(
                new Length(10.0, Length.LengthUnit.INCHES),
                new Length(12.0, Length.LengthUnit.INCHES)
        );
    }

    @Test
    public void testCrossUnitInequality() {
        assertNotEquals(
                new Length(1.0, Length.LengthUnit.FEET),
                new Length(10.0, Length.LengthUnit.INCHES)
        );
    }

    // ================= MULTIPLE UNIT SUPPORT =================

    @Test
    public void testMultipleFeetComparison() {
        assertEquals(
                new Length(2.0, Length.LengthUnit.FEET),
                new Length(24.0, Length.LengthUnit.INCHES)
        );
    }

    @Test
    public void yardEquals36Inches() {
        assertEquals(
                new Length(1.0, Length.LengthUnit.YARDS),
                new Length(36.0, Length.LengthUnit.INCHES)
        );
    }

    @Test
    public void centimeterEquals39Point3701Inches() {
        assertEquals(
                new Length(100.0, Length.LengthUnit.CENTIMETERS),
                new Length(39.3701, Length.LengthUnit.INCHES)
        );
    }

    @Test
    public void threeFeetEqualsOneYard() {
        assertEquals(
                new Length(3.0, Length.LengthUnit.FEET),
                new Length(1.0, Length.LengthUnit.YARDS)
        );
    }

    @Test
    public void thirtyPoint48CmEqualsOneFoot() {
        assertEquals(
                new Length(30.48, Length.LengthUnit.CENTIMETERS),
                new Length(1.0, Length.LengthUnit.FEET)
        );
    }

    // ================= NEGATIVE CASE =================

    @Test
    public void yardNotEqualToInches() {
        assertNotEquals(
                new Length(1.0, Length.LengthUnit.YARDS),
                new Length(35.0, Length.LengthUnit.INCHES)
        );
    }

    // ================= OBJECT BEHAVIOR =================

    @Test
    public void referenceEqualitySameObject() {
        Length l = new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(l, l);
    }

    @Test
    public void equalsReturnsFalseForNull() {
        assertNotEquals(
                new Length(1.0, Length.LengthUnit.FEET),
                null
        );
    }

    @Test
    public void differentValuesSameUnitNotEqual() {
        assertNotEquals(
                new Length(2.0, Length.LengthUnit.FEET),
                new Length(3.0, Length.LengthUnit.FEET)
        );
    }

    // ================= MATHEMATICAL PROPERTIES =================

    @Test
    public void reflexiveSymmetricAndTransitiveProperty() {

        Length a = new Length(1.0, Length.LengthUnit.FEET);
        Length b = new Length(12.0, Length.LengthUnit.INCHES);
        Length c = new Length(1.0, Length.LengthUnit.FEET);

        // Reflexive
        assertEquals(a, a);

        // Symmetric
        assertEquals(a, b);
        assertEquals(b, a);

        // Transitive
        assertEquals(a, b);
        assertEquals(b, c);
        assertEquals(a, c);
    }

    @Test
    public void equalityConsistencyMultipleCalls() {
        Length l1 = new Length(1.0, Length.LengthUnit.FEET);
        Length l2 = new Length(12.0, Length.LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
        assertTrue(l1.equals(l2));
        assertTrue(l1.equals(l2));
    }

    // ================= APP METHOD TEST =================

    @Test
    public void crossUnitEqualityDemonstrateMethod() {
        assertTrue(
                QuantityMeasurementApp.demonstrateLengthComparison(
                        1.0, Length.LengthUnit.FEET,
                        12.0, Length.LengthUnit.INCHES
                )
        );
    }

    @Test
    public void convertFeetToInches() {

        Length result = QuantityMeasurementApp.demonstrateLengthConversion(
                3.0,
                Length.LengthUnit.FEET,
                Length.LengthUnit.INCHES
        );

        Length expected = new Length(36.0, Length.LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(result, expected));
    }

    @Test
    public void convertYardsToInchesUsingOverloadedMethod() {

        Length yards = new Length(2.0, Length.LengthUnit.YARDS);

        Length result = QuantityMeasurementApp.demonstrateLengthConversion(
                yards,
                Length.LengthUnit.INCHES
        );

        Length expected = new Length(72.0, Length.LengthUnit.INCHES);

        assertTrue(QuantityMeasurementApp.demonstrateLengthEquality(result, expected));
    }
}