package com.constructor;


class ParkingFee {

    String vehicleType;
    int hours;
    double rate;

    // No-argument constructor
    ParkingFee() {
        this("Bike", 1, 20);
    }

    // Parameterized constructor
    ParkingFee(String vehicleType, int hours) {
        this(vehicleType, hours, 50);
    }

    // Constructor with all parameters
    ParkingFee(String vehicleType, int hours, double rate) {
        this.vehicleType = vehicleType;
        this.hours = hours;
        this.rate = rate;
    }

    double calculateFee() {
        return hours * rate;
    }

    void display() {
        System.out.println("Vehicle: " + vehicleType);
        System.out.println("Hours: " + hours);
        System.out.println("Parking Fee: " + calculateFee());
    }

    public static void main(String[] args) {
        ParkingFee p1 = new ParkingFee();
        ParkingFee p2 = new ParkingFee("Car", 3);
        ParkingFee p3 = new ParkingFee("SUV", 4, 100);

        p1.display();
        p2.display();
        p3.display();
    }
}