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
    public void TwoMinusTwoEqualsZero() {
        Calculator calculator = new Calculator(2, 2);
        assertEquals(0,calculator.subtraction());
    }
}
