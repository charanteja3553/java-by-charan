package com.constructor;

public class ElectricityDemo {
    public static void main(String[] args) {
        ElectricityBill.companyDetails();

        ElectricityBill b1 = new ElectricityBill();
        ElectricityBill b2 =
                new ElectricityBill("Charan", 450, 5.5);

        b1.displayBill();
        System.out.println("----------------");
        b2.displayBill();
    }
}