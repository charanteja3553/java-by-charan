package com.Methods;

import java.util.Scanner;

public class Method8 {

	// Method with return type + with parameters
	// WAP to print
	// Area of Triangle = 0.5 * base * height
	// Area of Rectangle = Length * breadth
	// Area of Square = side * side
	// Area of Circle = PI * r * r

	public static void main(String[] args) {
		System.out.println("main method started : ");
		Scanner sc = new Scanner(System.in);

		System.out.println("**********Area of Triangle ***************************");
		System.out.println("Enter Base : ");
		float base = sc.nextFloat();
		System.out.println("Enter Height : ");
		double height = sc.nextDouble();

		double areaTri = findAreaOfTraingle(base, height);
		System.out.println("Area Of Triangle : " + areaTri);

		System.out.println("***************Area Of Reactngle**********************");

		System.out.println("Enter length");
		long l = sc.nextLong();
		System.out.println("Enter breadth");
		long b = sc.nextLong();
		double arRec = findAreaOfRectangle(l, b);
		System.out.println("Area of Rectangle is : " + arRec);

		System.out.println("*******************Area of Square **************************");

		System.out.println("Enter side : ");
		int s = sc.nextInt();
		long arSq = findAreaOfSquare(s);
		System.out.println("Area of Square is : " + arSq);

		System.out.println("******************* Area of Circle **************");
		System.out.println("Enter Radius : ");
		double r = sc.nextDouble();
		double arCir = findAreaOfCircle(r);
		System.out.println("Area of Circle is : " + arCir);

		System.out.println("main method ended : ");
	}

	private static double findAreaOfCircle(double r) {
		return Math.PI * r * r;
	}

	private static long findAreaOfSquare(int s) {
		return s * s;
	}

	static double findAreaOfRectangle(long length, long breadth) {
		System.out.println("Reactangle info : ");
		double arRec = length * breadth;
		return arRec;
	}

	static double findAreaOfTraingle(float base, double height) {
		double arTr = 0.5 * base * height;
		return arTr;
	}

}
