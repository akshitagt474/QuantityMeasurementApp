package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;
import com.apps.quantitymeasurement.QuantityMeasurementApp.Inches;

public class QuantityMeasurementAppTest {

    // ===================== FEET TESTS =====================

    @Test
    public void testFeetEquality_SameValue() {
        assertEquals(new Feet(5.0), new Feet(5.0));
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        assertNotEquals(new Feet(5.0), new Feet(6.0));
    }

    @Test
    public void testFeetEquality_NullComparison() {
        assertNotEquals(new Feet(5.0), null);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        assertNotEquals(new Feet(5.0), "5.0");
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet f = new Feet(5.0);
        assertEquals(f, f);
    }

    // ===================== INCHES TESTS =====================

    @Test
    public void testInchesEquality_SameValue() {
        assertEquals(new Inches(10.0), new Inches(10.0));
    }

    @Test
    public void testInchesEquality_DifferentValue() {
        assertNotEquals(new Inches(10.0), new Inches(12.0));
    }

    @Test
    public void testInchesEquality_NullComparison() {
        assertNotEquals(new Inches(10.0), null);
    }

    @Test
    public void testInchesEquality_DifferentClass() {
        assertNotEquals(new Inches(10.0), "10.0");
    }

    @Test
    public void testInchesEquality_SameReference() {
        Inches i = new Inches(10.0);
        assertEquals(i, i);
    }
}