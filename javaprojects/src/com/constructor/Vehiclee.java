package com.constructor;

public class Vehiclee {

    String brand;

    public Vehiclee(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor");
    }

    public void displayVehiclee() {
        System.out.println("Brand: " + brand);
    }
}