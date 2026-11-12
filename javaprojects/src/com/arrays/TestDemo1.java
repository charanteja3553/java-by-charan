package com.arrays;

//WAP to print 10 Student ages using Array ..? 
public class TestDemo1 {

	public static void main(String[] args) {

		// LHS : Declaration
		int[] ages;

		// Creation
		ages = new int[100];//0 1 2 3 4 5 6 7 8 9 --> 10 Zero's 

		// Initialize
		ages[0] = 22;
		ages[1] = 21;
		ages[2] = 22;
		ages[3] = 25;
		ages[4] = 22;
		ages[5] = 23;

		// Representation using for loop
//		for (int i = 0; i < ages.length; i++) {
//			System.out.println(ages[i]);
//		}

		// Representation using for each loop
		System.out.println("All Student ages : ");
		for (int age : ages) {
			System.out.println(age);
		}

	}

}