package com.company;

public class Calculator {
    double number1;
    double number2;

    // add - addition
    // sub - subtraction
    // mul - multiplication
    // div - division

    public double add() {
        return this.number1 + this.number2;
    }

    public double sub() {
        return this.number1 - this.number2;
    }

    public double mul() {
        return this.number1 * this.number2;
    }

    public double div() {
        return this.number1 / this.number2;
    }
}
