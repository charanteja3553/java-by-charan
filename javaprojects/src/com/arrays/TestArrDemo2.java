package com.arrays;

//WAPto represent few names in Array ..? 
public class TestArrDemo2 {

	public static void main(String[] args) {

//		The literal 2147483648 of type int is out of range 
		String[] names = new String[2147483647];// 0 1 2 3 4 

		names[0] = "Sahith";
		names[1] = "Govind";
		names[2] = "Mohan";
		names[3] = "Srikanth";
		names[4] = "Java";
//		names[5] = "Vcube";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

//		for (String n : names) {
//			System.out.println(n);
//		}
	}
}