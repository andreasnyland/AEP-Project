package edu.berkeley.aep.project;

import edu.berkeley.aep.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void TwoPlusTwoEqualsFour() {
        Calculator calculator = new Calculator(2, 2);
        assertEquals(4,calculator.addition(),0.1);
    }

    @Test
    public void MinusTenPlusTwoPointTwoEqualsMinus7Point8() {
        Calculator calculator = new Calculator(-10, 2.2);
        assertEquals(-7.8,calculator.addition(),0.1);
    }

    @Test
    public void ThreeMinusThreeEqualsZero() {
        Calculator calculator = new Calculator(3, 3);
        assertEquals(0,calculator.subtraction(),0.1);
    }

    @Test
    public void MinusThreeMinusMinus5Point5Equals2Point5() {
        Calculator calculator = new Calculator(-3, -5.5);
        assertEquals(2.5,calculator.subtraction(),0.1);
    }

    @Test
    public void ThreeMultipliedWithThreeEqualsNine() {
        Calculator calculator = new Calculator(3, 3);
        assertEquals(9,calculator.multiply(),0.1);
    }

    @Test
    public void ThreeMultipliedWith5Point5Equals16Point5() {
        Calculator calculator = new Calculator(3, 5.5);
        assertEquals(16.5,calculator.multiply(),0.1);
    }

    @Test
    public void TenDividedWithTwoEqualsFive() {
        Calculator calculator = new Calculator(10, 2);
        assertEquals(5,calculator.divide(),0.1);
    }

    @Test
    public void TenDividedWithThreeEqualsThreePoint33() {
        Calculator calculator = new Calculator(10, 3);
        assertEquals(3.33d,calculator.divide(),0.1);
    }


    @Test
    public void FourSquaredEqualsTwo() {
        Calculator calculator = new Calculator(4);
        assertEquals(2,calculator.square(),0.1);
    }

    @Test
    public void TwentySquaredEqualsFourPoint47() {
        Calculator calculator = new Calculator(20);
        assertEquals(4.47d,calculator.square(),0.1);
    }
}
