package com.constructor;

public class RentalCar extends Car {

    double insurance;

    public RentalCar(String brand,
                     double rentPerDay,
                     double insurance) {

        super(brand, rentPerDay);
        this.insurance = insurance;

        System.out.println("RentalCar constructor");
    }

    public void displayBill(int days) {
        displayVehiclee();

        System.out.println("Rental days: " + days);
        System.out.println("Rent: " + calculateRent(days));
        System.out.println("Insurance: " + insurance);
        System.out.println("Total: "
                + (calculateRent(days) + insurance));
    }

    public static void main(String[] args) {

        RentalCar r = new RentalCar("Toyota", 2500, 500);

        r.displayBill(3);
    }
}