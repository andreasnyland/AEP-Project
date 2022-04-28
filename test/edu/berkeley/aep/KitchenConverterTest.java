package edu.berkeley.aep;

import org.junit.Test;

public class KitchenConverterTest {

    @Test
    public void oneTableSpoonEqualsThreeTeaSpoons(){
        var kitchenConverter = new KitchenConverter();

    }

    @Test
    public void oneOzEqualsTwoTableSpoons(){

    }

    @Test
    public void eightOzEqualsOneCup(){

    }

    @Test(expected = RuntimeException.class)
    public void shouldNotBeAbleToAddIncomparableUnits(){
        //var twoTbsp = new Quantity(2, Unit.TBSP);
        //var oneInch =
    }
}
