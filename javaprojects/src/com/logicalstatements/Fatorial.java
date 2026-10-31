package com.logicalstatements;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long fact = factorial(n);

        System.out.println("Factorial is: " + fact);

        sc.close();
    }

    static long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    
    }
}