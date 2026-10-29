package com.logicalstatements;

import java.util.Scanner;
//POC application programs of consoles
public class KFCorderinvoice {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double totalPrice = 0;

        do {
            System.out.println("\nEnter Category: Veg/Nonveg/Beverages/Desserts/RiceBowls");
            String category = sc.next();

            switch (category.toLowerCase()) {

                case "veg" -> {
                    String vyn = "";
                    double vegPrice = 0;

                    do {
                        System.out.println("\nSelect Veg Item:");
                        System.out.println("1. Veg Zinger Burger = Rs. 120");
                        System.out.println("2. Veg Strips = Rs. 150");
                        System.out.println("3. Veg Roll = Rs. 100");
                        System.out.print("Enter item number: ");

                        int choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {
                                System.out.println("Veg Zinger Burger selected");
                                vegPrice += 120;
                            }
                            case 2 -> {
                                System.out.println("Veg Strips selected");
                                vegPrice += 150;
                            }
                            case 3 -> {
                                System.out.println("Veg Roll selected");
                                vegPrice += 100;
                            }
                            default -> System.out.println("Invalid item!");
                        }

                        System.out.println("Continue Veg order? Y/N");
                        vyn = sc.next();

                    } while (vyn.equalsIgnoreCase("Y"));

                    System.out.println("Veg Total = Rs. " + vegPrice);
                    totalPrice += vegPrice;
                }

                case "nonveg" -> {
                    String nyn = "";
                    double nonvegPrice = 0;

                    do {
                        System.out.println("\nSelect Nonveg Item:");
                        System.out.println("1. Chicken Zinger Burger = Rs. 180");
                        System.out.println("2. Hot Wings = Rs. 200");
                        System.out.println("3. Chicken Popcorn = Rs. 160");
                        System.out.print("Enter item number: ");

                        int choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {
                                System.out.println("Chicken Zinger Burger selected");
                                nonvegPrice += 180;
                            }
                            case 2 -> {
                                System.out.println("Hot Wings selected");
                                nonvegPrice += 200;
                            }
                            case 3 -> {
                                System.out.println("Chicken Popcorn selected");
                                nonvegPrice += 160;
                            }
                            default -> System.out.println("Invalid item!");
                        }

                        System.out.println("Continue Nonveg order? Y/N");
                        nyn = sc.next();

                    } while (nyn.equalsIgnoreCase("Y"));

                    System.out.println("Nonveg Total = Rs. " + nonvegPrice);
                    totalPrice += nonvegPrice;
                }

                case "beverages" -> {
                    String byn = "";
                    double beveragePrice = 0;

                    do {
                        System.out.println("\nSelect Beverage:");
                        System.out.println("1. Pepsi = Rs. 60");
                        System.out.println("2. Cold Coffee = Rs. 90");
                        System.out.println("3. Water Bottle = Rs. 30");
                        System.out.print("Enter item number: ");

                        int choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {
                                System.out.println("Pepsi selected");
                                beveragePrice += 60;
                            }
                            case 2 -> {
                                System.out.println("Cold Coffee selected");
                                beveragePrice += 90;
                            }
                            case 3 -> {
                                System.out.println("Water Bottle selected");
                                beveragePrice += 30;
                            }
                            default -> System.out.println("Invalid item!");
                        }

                        System.out.println("Continue Beverages order? Y/N");
                        byn = sc.next();

                    } while (byn.equalsIgnoreCase("Y"));

                    System.out.println("Beverages Total = Rs. " + beveragePrice);
                    totalPrice += beveragePrice;
                }

                case "desserts" -> {
                    String dyn = "";
                    double dessertPrice = 0;

                    do {
                        System.out.println("\nSelect Dessert:");
                        System.out.println("1. Chocolate Brownie = Rs. 100");
                        System.out.println("2. Chocolate Lava Cake = Rs. 120");
                        System.out.println("3. Ice Cream = Rs. 70");
                        System.out.print("Enter item number: ");

                        int choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {
                                System.out.println("Chocolate Brownie selected");
                                dessertPrice += 100;
                            }
                            case 2 -> {
                                System.out.println("Chocolate Lava Cake selected");
                                dessertPrice += 120;
                            }
                            case 3 -> {
                                System.out.println("Ice Cream selected");
                                dessertPrice += 70;
                            }
                            default -> System.out.println("Invalid item!");
                        }

                        System.out.println("Continue Desserts order? Y/N");
                        dyn = sc.next();

                    } while (dyn.equalsIgnoreCase("Y"));

                    System.out.println("Desserts Total = Rs. " + dessertPrice);
                    totalPrice += dessertPrice;
                }

                case "ricebowls" -> {
                    String ryn = "";
                    double ricePrice = 0;

                    do {
                        System.out.println("\nSelect Rice Bowl:");
                        System.out.println("1. Veg Rice Bowl = Rs. 150");
                        System.out.println("2. Chicken Rice Bowl = Rs. 220");
                        System.out.println("3. Spicy Chicken Rice Bowl = Rs. 250");
                        System.out.print("Enter item number: ");

                        int choice = sc.nextInt();

                        switch (choice) {
                            case 1 -> {
                                System.out.println("Veg Rice Bowl selected");
                                ricePrice += 150;
                            }
                            case 2 -> {
                                System.out.println("Chicken Rice Bowl selected");
                                ricePrice += 220;
                            }
                            case 3 -> {
                                System.out.println("Spicy Chicken Rice Bowl selected");
                                ricePrice += 250;
                            }
                            default -> System.out.println("Invalid item!");
                        }

                        System.out.println("Continue Rice Bowl order? Y/N");
                        ryn = sc.next();

                    } while (ryn.equalsIgnoreCase("Y"));

                    System.out.println("Rice Bowl Total = Rs. " + ricePrice);
                    totalPrice += ricePrice;
                }

                default -> System.out.println("Invalid Category!");
            }

            System.out.println("\nDo you want to order another category? Y/N");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

        System.out.println("\n========== KFC INVOICE ==========");
        System.out.println("Total Price = Rs. " + totalPrice);
        System.out.println("Thank you for ordering!");
        System.out.println("=================================");

        sc.close();
    }
}
