package com.logicalstatements;

class Calculator {

    int addition(int a, int b) {
        int result = a + b;
        System.out.println("Addition: " + result);
        return result;
    }

    int subtraction(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
        return result;
    }

    int multiplication(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
        return result;
    }

    int division(int a, int b) {
        int result = a / b;
        System.out.println("Division: " + result);
        return result;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.division(
            c.multiplication(
                c.subtraction(
                    c.addition(10, 20), 5
                ), 2
            ), 5
        );
    }
}
