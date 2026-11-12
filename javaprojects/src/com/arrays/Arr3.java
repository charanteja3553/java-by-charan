package com.arrays;

public class Arr3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 15, 11, 17, 18, 19, 20 };// 0 1 2 3 4
		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
				System.out.println(arr[i]);
			}
		}

//		for (int a : arr) {
//			if (a % 2 == 0) {
//				System.out.println(a);
//			}
//		}

	}

}