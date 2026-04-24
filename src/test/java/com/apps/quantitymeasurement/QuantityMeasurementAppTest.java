package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.apps.quantitymeasurement.QuantityMeasurementApp.Feet;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality_SameValue() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(5.0);
        assertEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_DifferentValue() {
        Feet f1 = new Feet(5.0);
        Feet f2 = new Feet(6.0);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testFeetEquality_NullComparison() {
        Feet f1 = new Feet(5.0);
        assertNotEquals(f1, null);
    }

    @Test
    public void testFeetEquality_DifferentClass() {
        Feet f1 = new Feet(5.0);
        assertNotEquals(f1, "5.0");
    }

    @Test
    public void testFeetEquality_SameReference() {
        Feet f1 = new Feet(5.0);
        Feet f2 = f1;
        assertEquals(f1, f2);
    }
}