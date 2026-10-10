package com.constructor;


public class Flower {

    String name = "Rose";

    public Flower() {
        System.out.println("No arg constructor called from Flower");
    }

    public void flowerInfo() {
        System.out.println("Flower name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("main method started from Flower !!");

        Flower f = new Flower();
        f.flowerInfo();
    }
}