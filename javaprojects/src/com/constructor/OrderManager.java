

package com.constructor;

class OrderManager {

	int orderId;
	String product;
	int quantity;
	double price;

	OrderManager() {
		this(1001, "Mouse", 1, 500);
	}

	OrderManager(int orderId, String product) {
		this(orderId, product, 1, 500);
	}

	OrderManager(int orderId, String product, int quantity, double price) {

		this.orderId = orderId;
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}

	double calculateSubtotal() {
		return quantity * price;
	}

	double calculateGST() {
		return calculateSubtotal() * 0.18;
	}

	double calculateFinalAmount() {
		return calculateSubtotal() + calculateGST();
	}

	void displayOrder() {
		System.out.println("Order ID: " + orderId);
		System.out.println("Product: " + product);
		System.out.println("Quantity: " + quantity);
		System.out.println("Subtotal: " + calculateSubtotal());
		System.out.println("GST: " + calculateGST());
		System.out.println("Final Amount: " + calculateFinalAmount());
	}

	public static void main(String[] args) {

		OrderManager order = new OrderManager(1005, "Keyboard", 2, 1200);

		order.displayOrder();
	}
}
