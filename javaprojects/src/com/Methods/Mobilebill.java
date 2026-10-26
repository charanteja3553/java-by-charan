
package com.Methods;

import java.util.Scanner;

public class Mobilebill {

    String mobileModel;
    int quantity;
    double price;
    int deliveryCharges;

    // Constructor 1
    Mobilebill() {
        this("Unknown");
    }

    // Constructor 2
    Mobilebill(String mobileModel) {
        this(mobileModel, 0);
    }

    // Constructor 3
    Mobilebill(String mobileModel, int quantity) {
        this(mobileModel, quantity, 0);
    }

    // Constructor 4
    Mobilebill(String mobileModel, int quantity, double price) {
        this(mobileModel, quantity, price, 0);
    }

    // Constructor 5
    Mobilebill(String mobileModel, int quantity, double price, int deliveryCharges) {

        this.mobileModel = mobileModel;
        this.quantity = quantity;
        this.price = price;
        this.deliveryCharges = deliveryCharges;
    }

    double MobileCost() {

        double mobileCost = price * quantity;

        return mobileCost;
    }

    double Finalbill() {

        double finalBill = MobileCost() + deliveryCharges;

        return finalBill;
    }

    void display() {

        System.out.println("\n----- MOBILE BILL -----");

        System.out.println("Mobile Model    : " + mobileModel);
        System.out.println("Price           : " + price);
        System.out.println("Quantity        : " + quantity);
        System.out.println("Mobile Cost     : " + MobileCost());
        System.out.println("Delivery Charge : " + deliveryCharges);
        System.out.println("Final Bill      : " + Finalbill());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Mobile Model : ");
        String mobileModel = sc.nextLine();

        System.out.println("Enter quantity : ");
        int quantity = sc.nextInt();

        System.out.println("Enter Mobile Price : ");
        double price = sc.nextDouble();

        System.out.println("Enter delivery charges : ");
        int deliveryCharges = sc.nextInt();

        Mobilebill mb1 = new Mobilebill(
                mobileModel,
                quantity,
                price,
                deliveryCharges
        );

        mb1.display();

        sc.close();
    }
}
