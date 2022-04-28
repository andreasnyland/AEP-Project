package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {
    @Test
    public void allSidesSameLength(){
        var side = new Square(2);
        assertFalse(side.equals(2));
    }


}
