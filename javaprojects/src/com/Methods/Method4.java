package com.Methods;

// import java.util.ArrayList;
import java.util.Scanner;

public class Method4 {

	// WAP to read the elements from the console using Scanner class..

	public static void main(String[] args) {
		System.out.println("main method started ");

		//String s = new String();
		//Method4 m4=new Method4();
//		ArrayList a1=new ArrayList();
		
		/// Scanner ctrl+ click on scanner cls you go to package then for search ctrl +o
		Scanner sc = new Scanner(System.in);
		// Scanner is a package from java.util.scanner so for executing we have to apply
		// before cls import java.util.Scanner
		System.out.println("Enter your age : ");
		int age = sc.nextInt();

		sc.nextLine();
		// Advances this scanner past the current line and returns the input that was skipped
		System.out.println("Enter your First Name");
		String fn = sc.nextLine();

		System.out.println("Enter your last name ");
		String ln = sc.nextLine();

		System.out.println("Enter your height : ");
		float height = sc.nextFloat();

		System.out.println("Enter your weight : ");
		double weight = sc.nextDouble();

		System.out.println("Enter your gender info : ");
		char c = sc.next().charAt(0);// Male --> M --> Method chaining

//			Call by value 
		getStudentAge(age);
		getStudentFullName(fn, ln);
		studentHeightAndWeight(height, weight);
		studentGenderInfo(c);

		System.out.println("main method ended ");
	}

	static void studentGenderInfo(char c) {
		System.out.println("Gender info : " + c);
	}

	static void studentHeightAndWeight(float h, double w) {
		System.out.println("Student height is : " + h);
		System.out.println("Student Weight is : " + w);

	}

	static void getStudentFullName(String fname, String lname) {
		System.out.println("The Stuednt Full Name is : " + fname + " " + lname);
	}

	static void getStudentAge(int age) {
		System.out.println("Student Age is : " + age);
	}
}