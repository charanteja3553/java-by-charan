package com.logicalstatements;

import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        int Rev = reverseofnumber(n);

        if (Rev == n) {
            System.out.println("The Number is Palindrome");
        } else {
            System.out.println("The Number is not Palindrome");
        }

        System.out.println("Reversed Number: " + Rev);

        sc.close();
    }

    private static int reverseofnumber(int n) {

        int Rev = 0;

        while (n > 0) {

            int r = n % 10;
            n = n / 10;
            Rev = Rev * 10 + r;

        }

        return Rev;
    }
}