package com.java;

public class Product {
 int productId;
 String productName;
 float price;
 
 Product(int id , String name, float pr){
	 productId = id;
	 productName=name;
	 price = pr;

	}
  void display() {
	  System.out.println("ProductId: "+productId);
	  System.out.println("ProductName: "+productName);
	  System.out.println("Price:"+price);
  }
 public static void main(String[]args) {
	 System.out.println("Product Details: ");
	 Product p1 = new Product(1, "Laptop",2500);
	 p1.display();
 }
}
