package edu.berkeley.aep.project;

import edu.berkeley.aep.Rectangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void TwoPlusTwoEqualsFour() {
        Calculator calculator = new Calculator(2, 2);
        assertEquals(4,calculator.addition());
    }

    @Test
    public void ThreeMinusThreeEqualsZero() {
        Calculator calculator = new Calculator(3, 3);
        assertEquals(0,calculator.subtraction());
    }

    @Test
    public void ThreeMultipliedWithThreeEqualsNine() {
        Calculator calculator = new Calculator(3, 3);
        assertEquals(9,calculator.multiply());
    }

    @Test
    public void TenDividedWithTwoEqualsFive() {
        Calculator calculator = new Calculator(10, 2);
        assertEquals(5,calculator.divide());
    }
}
