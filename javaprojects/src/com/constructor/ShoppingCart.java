package com.constructor;

class ShoppingCart {
    String customer;
    double price;
    int quantity;
    double walletBalance;

    // Default constructor
    ShoppingCart() {
        this("Guest", 0, 0, 0);
    }

    // Constructor with customer details
    ShoppingCart(String customer) {
        this(customer, 0, 0, 0);
    }

    // Parameterized constructor
    ShoppingCart(String customer, double price,
                 int quantity, double walletBalance) {
        this.customer = customer;
        this.price = price;
        this.quantity = quantity;
        this.walletBalance = walletBalance;
    }

    double calculateTotal() {
        return price * quantity;
    }

    // Method overloading
    double calculateTotal(double deliveryCharge) {
        return calculateTotal() + deliveryCharge;
    }

    double calculateDiscount() {
        double total = calculateTotal();

        if (total >= 5000)
            return total * 0.15;
        else if (total >= 2000)
            return total * 0.05;
        else
            return 0;
    }

    int calculateRewardPoints() {
        return (int) (calculateTotal() / 100);
    }

    void checkout(double deliveryCharge) {
        double total = calculateTotal(deliveryCharge);
        double discount = calculateDiscount();
        double payable = total - discount;

        System.out.println("Customer: " + customer);
        System.out.println("Product Cost: Rs." + calculateTotal());
        System.out.println("Delivery: Rs." + deliveryCharge);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + payable);

        if (walletBalance >= payable) {
            walletBalance -= payable;
            System.out.println("Payment Successful!");
            System.out.println("Remaining Wallet: Rs." + walletBalance);
        } else {
            System.out.println("Insufficient Wallet Balance!");
        }

        System.out.println("Reward Points: " + calculateRewardPoints());
    }

    static void showStore() {
        System.out.println("Welcome to Smart Shopping!");
    }
}
