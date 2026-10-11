package com.constructor;

public class Car extends Vehiclee {

    double rentPerDay;

    public Car(String brand, double rentPerDay) {
        super(brand);
        this.rentPerDay = rentPerDay;

        System.out.println("Car constructor");
    }

    public double calculateRent(int days) {
        return rentPerDay * days;
    }
}