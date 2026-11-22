package com.arrays;

import java.util.Scanner;

public class Arr6 {

    static boolean isPrime(int n) {

        boolean status = true;

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                status = false;
                break;
            }
        }

        return status;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Prime numbers:");

        for (int n : numbers) {

            if (isPrime(n)) {
                System.out.print(n + " ");
            }
        }

        sc.close();
    }
}