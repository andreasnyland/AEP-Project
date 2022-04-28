package edu.berkeley.aep;

import java.math.BigDecimal;

//Understands the likelihood of something happening
public class Chance {

    private double probability;
    //private double notHappening;

    public Chance(double probability){
        this.probability = probability;
        //this.notHappening = 1-probability;
    }

    //example of deleagtion
    public Chance not(){
        return new Chance(1-probability);
    }


  /*  public double getProbability() {
        return probability;
    }
  */
//Should write javadoc for all code you write
    @Override
    public boolean equals(Object other){
        if (other==this) return true;
        if(!(other instanceof Chance)) return false;
        return Double.compare(((Chance) other).probability, probability) == 0;

    }

    @Override
    public int hashCode(){
        return Double.hashCode(probability);
    }

    @Override
    public String toString() {
        return "Probability " + probability;
    }

    public Chance and(Chance coinToss) {
        return new Chance(probability*coinToss.probability);

    }

    public Chance or(Chance otherProbability) {
        //System.out.println(probability+ coinToss.probability-probability*coinToss.probability);
        //return new Chance((probability+ coinToss.probability-probability*coinToss.probability));

        // calculate or using DeMorgan's Law, more object oriented with object collaborating
        return this.not().and(otherProbability.not()).not();

        //return new Chance(probability + otherProbability.probability - (this.and(otherProbability).probability));

        //Chance otherComplement = otherProbability.not();
        //return this.not().and(otherComplement).not();
    }
}

