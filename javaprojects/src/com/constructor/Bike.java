package com.constructor;

//Parent or Super or Base 
class Vehicle extends Object {
	String brand;
	String model;
	double price;

	Vehicle() {
		System.out.println("No arg Constructor called from Vehicle ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Vehicle");
	}
}

//Child or Sub or Derived 
public class Bike extends Vehicle {

	Bike() {
		System.out.println("No arg Constructor called from Bike");
	}

	Bike(String brand, String model, double price) {
		super.brand = brand;
		super.model = model;
		super.price = price;
	}

	public static void main(String[] args) {
		System.out.println("main method stareted from Bike ");

//		Bike b = new Bike();
//		b.bikeInfo();

		Bike b1 = new Bike("RE", "Classic", 300000.00);
		b1.bikeInfo();

		System.out.println("main method ended from Bike ");
	}

	void bikeInfo() {
		System.out.println("Brand of the Bike : " + brand);
		System.out.println("Model of the Bike : " + model);
		System.out.println("Price of the Bike : " + price);
	}
}