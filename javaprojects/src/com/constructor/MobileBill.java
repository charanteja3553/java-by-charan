package com.constructor;

import java.util.Scanner;

class MobileBill {

    String model;
    int quantity;
    double price;
    double deliveryCharge;

    // Constructor 1
    MobileBill() {
        this("Unknown");
    }

    // Constructor 2
    MobileBill(String model) {
        this(model, 1);
    }

    // Constructor 3
    MobileBill(String model, int quantity) {
        this(model, quantity, 0);
    }

    // Constructor 4
    MobileBill(String model, int quantity, double price) {
        this(model, quantity, price, 0);
    }

    // Constructor 5
    MobileBill(String model, int quantity, double price, double deliveryCharge) {
        this.model = model;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCharge = deliveryCharge;
    }

    void displayBill() {

        double mobileCost = price * quantity;
        double finalBill = mobileCost + deliveryCharge;

        System.out.println("\n----- MOBILE BILL -----");
        System.out.println("Mobile Model     : " + model);
        System.out.println("Price            : " + price);
        System.out.println("Quantity         : " + quantity);
        System.out.println("Mobile Cost      : " + mobileCost);
        System.out.println("Delivery Charge  : " + deliveryCharge);
        System.out.println("Final Bill       : " + finalBill);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mobile Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Delivery Charge: ");
        double deliveryCharge = sc.nextDouble();

        MobileBill mb = new MobileBill(model, quantity, price, deliveryCharge);

        mb.displayBill();

        sc.close();
    }
}
