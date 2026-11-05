package com.logicalstatements;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Number");
		int n = sc.nextInt();

		int sum = 0;

		while (n != 1 && n != 4) {

			sum = 0;

			while (n > 0) {

				int r = n % 10;

				sum = sum + (r * r);

				n = n / 10;
			}

			n = sum;
		}

		if (n == 1) {
			System.out.println("Happy Number");
		} else {
			System.out.println("Not a Happy Number");
		}

		sc.close();
	}
}