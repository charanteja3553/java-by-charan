package com.constructor;

public class Product {

	int productId;
	String productName;
	double price;
	int quantiy;

	Product(int productId, String productName, double price, int quantiy) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantiy = quantiy;
	}

	Product(Product p1) {
		this.productId = p1.productId;
		this.productName = p1.productName;
		this.price = p1.price;
		this.quantiy = p1.quantiy;
	}

	double calculateTotal() {
		return price * quantiy;
	}

	public static void main(String[] args) {

		Product p1 = new Product(1, "Laptop", 50000, 5);
		Product p2 = new Product(p1);
		p2.quantiy = 2;

		System.out.println("Product1 Total " + p1.calculateTotal());
		System.out.println("Product1 Total " + p2.calculateTotal());
		System.out.println("Product1&2 Total " + (p1.calculateTotal() + p2.calculateTotal()));
		System.out.println("Product1&2 Total " + (p1.calculateTotal() * p2.calculateTotal()));
	}

}
