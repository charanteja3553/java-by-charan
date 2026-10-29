package com.logicalstatements;

import java.util.Scanner;

public class ShoppingMallInvoice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String yn = "";
		double totalPrice = 0;

		do {
			System.out.println("\nEnter Category: clothing / footwear / electronics");
			String category = sc.next();

			switch (category) {

			case "clothing" -> {
				double clothingPrice = 0;
				String c = "";

				do {
					System.out.println("Select: tsh / jns / jak / shr");
					String item = sc.next();

					switch (item) {
					case "tsh" -> {
						System.out.println("T-Shirt = Rs. 499");
						clothingPrice += 499;
					}
					case "jns" -> {
						System.out.println("Jeans = Rs. 999");
						clothingPrice += 999;
					}
					case "jak" -> {
						System.out.println("Jacket = Rs. 1999");
						clothingPrice += 1999;
					}
					case "shr" -> {
						System.out.println("Shirt = Rs. 799");
						clothingPrice += 799;
					}
					default -> System.out.println("Item unavailable!");
					}

					System.out.println("Continue clothing shopping? Y/N");
					c = sc.next();

				} while (c.equalsIgnoreCase("Y"));

				System.out.println("Clothing total = Rs. " + clothingPrice);
				totalPrice += clothingPrice;
			}

			case "footwear" -> {
				double footwearPrice = 0;
				String f = "";

				do {
					System.out.println("Select: snk / snd / hls / flp");
					String item = sc.next();

					switch (item) {
					case "snk" -> {
						System.out.println("Sneakers = Rs. 1499");
						footwearPrice += 1499;
					}
					case "snd" -> {
						System.out.println("Sandals = Rs. 599");
						footwearPrice += 599;
					}
					case "hls" -> {
						System.out.println("Formal Shoes = Rs. 1299");
						footwearPrice += 1299;
					}
					case "flp" -> {
						System.out.println("Flip-Flops = Rs. 249");
						footwearPrice += 249;
					}
					default -> System.out.println("Item unavailable!");
					}

					System.out.println("Continue footwear shopping? Y/N");
					f = sc.next();

				} while (f.equalsIgnoreCase("Y"));

				System.out.println("Footwear total = Rs. " + footwearPrice);
				totalPrice += footwearPrice;
			}

			case "electronics" -> {
				double electronicsPrice = 0;
				String e = "";

				do {
					System.out.println("Select: ear / mou / key / usb");
					String item = sc.next();

					switch (item) {
					case "ear" -> {
						System.out.println("Earphones = Rs. 799");
						electronicsPrice += 799;
					}
					case "mou" -> {
						System.out.println("Mouse = Rs. 499");
						electronicsPrice += 499;
					}
					case "key" -> {
						System.out.println("Keyboard = Rs. 999");
						electronicsPrice += 999;
					}
					case "usb" -> {
						System.out.println("USB Drive = Rs. 399");
						electronicsPrice += 399;
					}
					default -> System.out.println("Item unavailable!");
					}

					System.out.println("Continue electronics shopping? Y/N");
					e = sc.next();

				} while (e.equalsIgnoreCase("Y"));

				System.out.println("Electronics total = Rs. " + electronicsPrice);
				totalPrice += electronicsPrice;
			}

			default -> System.out.println("Invalid category!");
			}

			System.out.println("Continue with another category? Y/N");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("Y"));

		System.out.println("\n========== MALL INVOICE ==========");
		System.out.println("Total purchase amount = Rs. " + totalPrice);
		System.out.println("Thank you for shopping!");

		sc.close();
	}
}
