package com.constructor;

class ElectricityBill {
    String customerName;
    int units;
    double rate;

    // Default constructor
    ElectricityBill() {
        this("Unknown", 0, 5.0);
    }

    // Parameterized constructor
    ElectricityBill(String customerName, int units, double rate) {
        this.customerName = customerName;
        this.units = units;
        this.rate = rate;
    }

    // Method overloading
    double calculateBill() {
        return units * rate;
    }

    double calculateBill(double fixedCharge) {
        return (units * rate) + fixedCharge;
    }

    // Return-type method
    double getDiscount(double bill) {
        return bill >= 2000 ? bill * 0.10 : 0;
    }

    // Instance method
    void displayBill() {
        double bill = calculateBill(100);
        double discount = getDiscount(bill);

        System.out.println("Customer: " + customerName);
        System.out.println("Units: " + units);
        System.out.println("Bill: Rs." + bill);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Bill: Rs." + (bill - discount));
    }

    // Static method
    static void companyDetails() {
        System.out.println("Electricity Board Billing System");
    }
}

