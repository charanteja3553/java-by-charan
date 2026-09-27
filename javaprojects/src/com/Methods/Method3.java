package com.Methods;

public class Method3 {
	//WAP to print about your self with methods includes parameters..?


		public static void main(String[] args) {
			System.out.println("main method started ");

			getAgeInfo(22);
			getFullName("Srikanth", "C");
			weightInfo(68.5);
			heightInfo(5.9F);
			sscmarks(99, 95, 94, 87, 86, 82);
			genInfo('M');
			add(10, 20);

			System.out.println("main method ended ");
		}

		static void add(int a, int b) {
			System.out.println(a + b + " -> addition : ");
		}

		static void genInfo(char c) {
			System.out.println("The Person Gender info : " + c);
		}

		static void sscmarks(int t, int e, int m, int sc, int so, int h) {
			double sum = t + e + m + sc + so + h;
			System.out.println("Total marks in SSC : " + sum);
			double avg = sum / 6;
			System.out.println("avg marks of SSC : " + avg);

		}

		static void heightInfo(float height) {
			System.out.println("Height of the Person : " + height);
		}

		static void weightInfo(double weight) {
			System.out.println("The Person Weight is : " + weight);
		}

		static void getFullName(String fname, String lname) {
			System.out.println("The Person Full Name is : " + fname + " " + lname);
		}

		static void getAgeInfo(int age) {
			System.out.println("Age of the Person is : " + age);
		}

	}