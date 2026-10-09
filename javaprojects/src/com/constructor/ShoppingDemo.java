package com.constructor;


public class ShoppingDemo {
    public static void main(String[] args) {
        ShoppingCart.showStore();

        ShoppingCart c1 =
                new ShoppingCart("Charan", 1500, 3, 5000);

        ShoppingCart c2 =
                new ShoppingCart("Rahul", 800, 2, 1000);

        c1.checkout(100);
        System.out.println("------------------");
        c2.checkout(50);
    }
}
