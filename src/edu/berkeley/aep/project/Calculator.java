package edu.berkeley.aep.project;

//Understands the product of two numbers added, subtracted, multiplied, divided
public class Calculator {

    private final int firstNumber, secondNumber;

    public Calculator(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int addition() {
        return firstNumber + secondNumber;
    }

    public int subtraction() {
        return firstNumber - secondNumber;
    }

    public int multiply() {
        return firstNumber*secondNumber;
    }
}
