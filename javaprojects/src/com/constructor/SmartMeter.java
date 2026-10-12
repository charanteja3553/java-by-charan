package com.constructor;

class SmartMeter {

	String customerName;
	int units;
	double rate;
	double serviceCharge;

	SmartMeter() {
		this("Unknown", 0, 5, 50);
	}

	SmartMeter(String name, int units) {
		this(name, units, 5, 50);
	}

	SmartMeter(String name, int units, double rate, double serviceCharge) {

		this.customerName = name;
		this.units = Math.max(units, 0);
		this.rate = Math.max(rate, 0);
		this.serviceCharge = Math.max(serviceCharge, 0);
	}

	double calculateBill() {
		return units * rate + serviceCharge;
	}

	void displayBill() {
		System.out.println("Customer: " + customerName);
		System.out.println("Units: " + units);
		System.out.println("Total Bill: " + calculateBill());
	}

	public static void main(String[] args) {
		SmartMeter m = new SmartMeter("Charan", 250, 6, 75);
		m.displayBill();
	}
}