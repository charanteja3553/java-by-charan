package com.arrays;

//WAP to print sum & avg of Student marks..?
//input : 99 98 97 96 95 94 
//output : sum = 579 & avg = 96.587576
public class Arr4 {

	public static void main(String[] args) {
		int[] marks = { 99, 98, 97, 96, 95, 94 };// 0 1 2 3 4 5

		double sum = 0;
		double avg = 0;

//		for (int i = 0; i < marks.length; i++) {
//			sum = sum + marks[i];
//		}

		for (int m : marks) {
			sum += m;
		}

		avg = sum / marks.length;

		System.out.println("Sum of all the marks : " + sum);
		System.out.println("avg of all the marks  :" + avg);

	}

}