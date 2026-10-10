package com.constructor;

public class Rose extends Flower {

    public Rose() {
        super();
        System.out.println("No arg constructor called from Rose");
    }

    public void roseInfo() {
        System.out.println("Rose is a flower");
    }

    public static void main(String[] args) {

        System.out.println("main method started from Rose !!");

        Rose r = new Rose();

        r.flowerInfo();
        r.roseInfo();
    }
}