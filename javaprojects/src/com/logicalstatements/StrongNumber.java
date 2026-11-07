package com.logicalstatements;

import java.util.Scanner;

public class StrongNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;

        while (temp > 0) {

            int r = temp % 10;
            int fact = 1;
            int i = 1;

            while (i <= r) {
                fact = fact * i;
                i++;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if (sum == n) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }

        sc.close();
    }
}