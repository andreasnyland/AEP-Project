package edu.berkeley.aep;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class ChanceTest {

  /*  @Test
    public void probabilityOfNotHappeningIs1MinusProbability(){
        var chance = new Chance(0.4);
        assertTrue(chance.not() == 0.6);

    }
*/
    @Test
    public void probabilityOfDieThrowShouldNotBeSameAsProbabilityOfCoinToss(){
        var dieThrow = new Chance(1d/6d);
        var coinToss = new Chance(1d/2d);
        assertFalse(coinToss.equals(dieThrow));

    }

    @Test
    public void andProbabilityOfOneHalfAndOneSixthShouldBeOneTwelth(){
        var dieRoll = new Chance(1d/6d);
        var coinToss = new Chance(1d/2d);
        assertEquals(dieRoll.and(coinToss),new Chance(1d/12d));
    }

    @Test
    public void orProbabilityOfOneHalfAndOneSixthShouldBeOneSevenTwelth(){
        var dieRoll = new Chance(1d/6d);
        var coinToss = new Chance(1d/2d);
        assertEquals(dieRoll.or(coinToss),new Chance(7d/12d));
    }

    @Test
    public void zeroPoint5And0point5ShouldBe0point25(){
        var dieRoll = new Chance(0.25);
        assertEquals(new Chance(0.25), dieRoll.and(dieRoll));
    }
    @Test
    public void zeroPoint5Or0point5ShouldBe0point75(){
        var dieRoll = new Chance(0.25);
        assertEquals(new Chance(0.25), dieRoll.or(dieRoll));
    }



    @Test
    public void notOfProbabilityOneSixthShouldBeFiveSixth(){
        var dieRoll = new Chance(1/(double)6);
        var dieRoleComplement = new Chance(5d/6d);
        assertEquals(dieRoleComplement,dieRoll.not());

    }

    @Test
    public void valueObjectShouldOverrideHashcode(){
        var coinToss = new Chance(0.5);
        var coinTosses = new HashMap<Chance, String>();
        coinTosses.put(coinToss, "Heads!");
        assertEquals("Heads!", coinTosses.get(new Chance(0.5)));

    }
}
