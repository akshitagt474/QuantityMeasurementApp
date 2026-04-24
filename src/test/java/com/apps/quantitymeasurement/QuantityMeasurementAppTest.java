package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        Length f1 = new Length(5.0, Length.LengthUnit.FEET);
        Length f2 = new Length(5.0, Length.LengthUnit.FEET);
        assertEquals(f1, f2);
    }

    @Test
    public void testInchesEquality() {
        Length i1 = new Length(10.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(10.0, Length.LengthUnit.INCHES);
        assertEquals(i1, i2);
    }

    @Test
    public void testFeetInchesComparison() {
        Length f = new Length(1.0, Length.LengthUnit.FEET);
        Length i = new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(f, i);
    }

    @Test
    public void testFeetInequality() {
        Length f1 = new Length(5.0, Length.LengthUnit.FEET);
        Length f2 = new Length(6.0, Length.LengthUnit.FEET);
        assertNotEquals(f1, f2);
    }

    @Test
    public void testInchesInequality() {
        Length i1 = new Length(10.0, Length.LengthUnit.INCHES);
        Length i2 = new Length(12.0, Length.LengthUnit.INCHES);
        assertNotEquals(i1, i2);
    }

    @Test
    public void testCrossUnitInequality() {
        Length f = new Length(1.0, Length.LengthUnit.FEET);
        Length i = new Length(10.0, Length.LengthUnit.INCHES);
        assertNotEquals(f, i);
    }

    @Test
    public void testMultipleFeetComparison() {
        Length f1 = new Length(2.0, Length.LengthUnit.FEET);
        Length f2 = new Length(24.0, Length.LengthUnit.INCHES);
        assertEquals(f1, f2);
    }
}