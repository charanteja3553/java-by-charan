package com.logicalstatements;

import java.util.Scanner;

public class FoodOrderingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("========== FOOD ORDERING SYSTEM ==========");

		System.out.println("1. Pizza     - Rs. 200");
		System.out.println("2. Burger    - Rs. 120");
		System.out.println("3. Biryani   - Rs. 180");
		System.out.println("4. Noodles   - Rs. 100");

		System.out.print("\nEnter your choice: ");
		int choice = sc.nextInt();

		String item = "";
		double price = 0;
		int quantity = 0;
		double totalBill = 0;

		switch (choice) {

		case 1 -> {
			item = "Pizza";
			price = 200;
		}

		case 2 -> {
			item = "Burger";
			price = 120;
		}

		case 3 -> {
			item = "Biryani";
			price = 180;
		}

		case 4 -> {
			item = "Noodles";
			price = 100;
		}

		default -> System.out.println("Invalid food selection!");
		}

		if (price > 0) {

			System.out.print("Enter quantity: ");
			quantity = sc.nextInt();

			if (quantity > 0) {

				totalBill = price * quantity;

				System.out.println("\n========== FOOD INVOICE ==========");
				System.out.println("Selected Item : " + item);
				System.out.println("Price         : Rs. " + price);
				System.out.println("Quantity      : " + quantity);
				System.out.println("Total Bill    : Rs. " + totalBill);
				System.out.println("==================================");
				System.out.println("Thank you for ordering!");

			} else {
				System.out.println("Quantity must be greater than zero.");
			}
		}

		sc.close();
	}
}
