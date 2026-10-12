package com.constructor;

class FoodOrder {

    int orderId;
    String foodName;
    int quantity;
    double price;
    double deliveryFee;

    FoodOrder() {
        this(1001, "Burger", 1, 120, 30);
    }

    FoodOrder(int orderId, String foodName) {
        this(orderId, foodName, 1, 120, 30);
    }

    FoodOrder(int orderId, String foodName,
              int quantity, double price, double deliveryFee) {

        this.orderId = orderId;
        this.foodName = foodName;
        this.quantity = Math.max(quantity, 0);
        this.price = Math.max(price, 0);
        this.deliveryFee = Math.max(deliveryFee, 0);
    }

    double calculateFoodCost() {
        return quantity * price;
    }

    double calculateTotal() {
        return calculateFoodCost() + deliveryFee;
    }

    void printReceipt() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Food: " + foodName);
        System.out.println("Food Cost: " + calculateFoodCost());
        System.out.println("Delivery: " + deliveryFee);
        System.out.println("Total: " + calculateTotal());
    }

    public static void main(String[] args) {
        FoodOrder order =
                new FoodOrder(2001, "Pizza", 2, 250, 40);

        order.printReceipt();
    }
}