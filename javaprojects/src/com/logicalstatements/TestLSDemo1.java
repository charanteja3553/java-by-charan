package com.logicalstatements;

import java.util.Scanner;

public class TestLSDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String yn = "";
        double totalPrice = 0;

        do {
            System.out.println("\nEnter Category: starters / maincourse / desserts");
            String category = sc.next();

            switch (category) {

                case "starters" -> {
                    double starterPrice = 0;
                    String s = "";

                    do {
                        System.out.println("Select: soup / fries / paneer / wings");
                        String item = sc.next();

                        switch (item) {
                            case "soup" -> {
                                System.out.println("Tomato Soup = Rs. 100");
                                starterPrice += 100;
                            }
                            case "fries" -> {
                                System.out.println("French Fries = Rs. 120");
                                starterPrice += 120;
                            }
                            case "paneer" -> {
                                System.out.println("Paneer Tikka = Rs. 220");
                                starterPrice += 220;
                            }
                            case "wings" -> {
                                System.out.println("Chicken Wings = Rs. 250");
                                starterPrice += 250;
                            }
                            default -> System.out.println("Item unavailable!");
                        }

                        System.out.println("Order another starter? Y/N");
                        s = sc.next();

                    } while (s.equalsIgnoreCase("Y"));

                    System.out.println("Starter total = Rs. " + starterPrice);
                    totalPrice += starterPrice;
                }

                case "maincourse" -> {
                    double mainPrice = 0;
                    String m = "";

                    do {
                        System.out.println("Select: biryani / friedrice / naan / meals");
                        String item = sc.next();

                        switch (item) {
                            case "biryani" -> {
                                System.out.println("Chicken Biryani = Rs. 250");
                                mainPrice += 250;
                            }
                            case "friedrice" -> {
                                System.out.println("Veg Fried Rice = Rs. 180");
                                mainPrice += 180;
                            }
                            case "naan" -> {
                                System.out.println("Butter Naan = Rs. 60");
                                mainPrice += 60;
                            }
                            case "meals" -> {
                                System.out.println("Veg Meals = Rs. 160");
                                mainPrice += 160;
                            }
                            default -> System.out.println("Item unavailable!");
                        }

                        System.out.println("Order another main course? Y/N");
                        m = sc.next();

                    } while (m.equalsIgnoreCase("Y"));

                    System.out.println("Main course total = Rs. " + mainPrice);
                    totalPrice += mainPrice;
                }

                case "desserts" -> {
                    double dessertPrice = 0;
                    String d = "";

                    do {
                        System.out.println("Select: cake / icecream / gulab / brownie");
                        String item = sc.next();

                        switch (item) {
                            case "cake" -> {
                                System.out.println("Cake = Rs. 150");
                                dessertPrice += 150;
                            }
                            case "icecream" -> {
                                System.out.println("Ice Cream = Rs. 90");
                                dessertPrice += 90;
                            }
                            case "gulab" -> {
                                System.out.println("Gulab Jamun = Rs. 80");
                                dessertPrice += 80;
                            }
                            case "brownie" -> {
                                System.out.println("Brownie = Rs. 120");
                                dessertPrice += 120;
                            }
                            default -> System.out.println("Item unavailable!");
                        }

                        System.out.println("Order another dessert? Y/N");
                        d = sc.next();

                    } while (d.equalsIgnoreCase("Y"));

                    System.out.println("Dessert total = Rs. " + dessertPrice);
                    totalPrice += dessertPrice;
                }

                default -> System.out.println("Invalid category!");
            }

            System.out.println("Order another category? Y/N");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

        System.out.println("\n========== RESTAURANT INVOICE ==========");
        System.out.println("Final bill = Rs. " + totalPrice);

        sc.close();
    }
}
