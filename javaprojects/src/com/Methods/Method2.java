package com.Methods;

//2) Method with no return type + with parameters 
//WAP to calculate the values based on your input..
public class Method2 {

	public static void main(String[] args) {

		System.out.println("main method started ");

//		call by value by passing the arguments 
		addition(10, 20);
		subtraction(100, 200);
		multiplication(87, 876);
		modulus(98, 5);
		division(98, 5);

		System.out.println("main method ended ");
	}

	static void addition(int a, int b) {
		System.out.println("addition method called ");// sum
		System.out.println(a + b);
	}

	static void subtraction(int a, int b) {
		System.out.println("subtraction method called ");// Difference
		System.out.println(a - b);
	}

	static void multiplication(int a, int b) {
		System.out.println("multiplication method called ");// Product
		System.out.println(a * b);
	}

	static void modulus(int a, int b) {
		System.out.println("modulus method called ");// 98%5 = 3 Reminder
		System.out.println(a % b);
	}

	static void division(int a, int b) {
		System.out.println("Division method called ");// Quotient
		System.out.println(a / b);//19
	}

}