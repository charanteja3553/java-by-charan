package com.arrays;

//WAP to print min & max number from Given Array ..? 
//input : {7,4,3,1,18,45,33,9,1,99};
//output : min = 1, max = 99 
public class Arr5 {

	public static void main(String[] args) {
		int[] numbers = { 7, 4, 3, 1 };

		int min = numbers[0];// 7 4 3 1
		int max = numbers[0];// 7 

//		for (int n : numbers) {
//			if (n < min) {
//				min = n;
//			}else if (n > max) {
//				max = n;
//			}
//		}

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			} else if (numbers[i] > max) {
				max = numbers[i];
			}
		}

		System.out.println("Minimum number from an array : " + min);
		System.out.println("Maximum number from an array : " + max);

	}

}