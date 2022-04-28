package edu.berkeley.aep.project;

//Understands the product of two numbers added, subtracted, multiplied, divided
public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public Calculator(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public Calculator(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double addition() {
        return firstNumber + secondNumber;
    }

    public double subtraction() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber*secondNumber;
    }

    public double divide() {
        return firstNumber/secondNumber;
    }


    public double square() {
        return Math.sqrt(firstNumber);

    }
}
