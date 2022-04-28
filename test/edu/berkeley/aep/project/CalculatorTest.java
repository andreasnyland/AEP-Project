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
    public void ThreeMinusThreeEqualsZero() {
        Calculator calculator = new Calculator(3, 3);
        assertEquals(0,calculator.subtraction(),0.1);
    }

    @Test
    public void ThreeMultipliedWithThreeEqualsNine() {
        Calculator calculator = new Calculator(3d, 3d);
        assertEquals(9d,calculator.multiply(),0.1);
    }

    @Test
    public void TenDividedWithTwoEqualsFive() {
        Calculator calculator = new Calculator(10d, 2d);
        assertEquals(5d,calculator.divide(),0.1);
    }


    @Test
    public void FourSquaredEqualsTwo() {
        Calculator calculator = new Calculator(4);
        assertEquals(2,calculator.square(),0.1);
    }
}
