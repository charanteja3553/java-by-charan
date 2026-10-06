package com.logicalstatements;

import java.util.Scanner;

public class testdemoloop {

	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
		for (char ch = 'Z'; ch >= 'A'; ch--) {
			System.out.print(ch + " ");
		}
		sc.close();
	}

}
