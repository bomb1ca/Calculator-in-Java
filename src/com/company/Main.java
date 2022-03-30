package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter your first number: ");
        calculator.number1 = scanner.nextDouble();
        System.out.println("Enter an operator ( + , - , * , / ) : ");
        String operator = scanner.next();
        System.out.println("Enter your second number: ");
        calculator.number2 = scanner.nextDouble();
        System.out.println("Result is: ");

        if (operator.contains("+")) {
            System.out.println(calculator.add());
        } else if (operator.contains("-")) {
            System.out.println(calculator.sub());
        } else if (operator.contains("*")) {
            System.out.println(calculator.mul());
        } else if (operator.contains("/")) {
            System.out.println(calculator.div());
        } else {
            System.out.println("Invalid operator");
        }


    }

}
