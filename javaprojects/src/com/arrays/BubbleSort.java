package com.arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 7, 6, 5, 4, 3, 2, 1 };

		System.out.println("Before Sorted  : ");
		System.out.println(Arrays.toString(arr));

		int temp = 0;
		int count1 = 0;
		int count2 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			count1++;
			boolean flag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				count2++;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = true;
				}
			}

			if (!flag) {
				break;
			}

		}

		System.out.println(count1);
		System.out.println(count2);

		System.out.println("After Sorted  : ");
		System.out.println(Arrays.toString(arr));
	}

}