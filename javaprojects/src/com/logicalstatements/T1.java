package com.logicalstatements;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Good day!!");
			System.out.println("Congartulations !! you elgible for Driving & Voting");
		}
		else {
			System.out.println("Ms/Mr..........You still have time");
		}
		System.out.println("Main method ended");
		sc.close();
	}

}
