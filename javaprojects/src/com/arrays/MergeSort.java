package com.arrays;

import java.util.Arrays;

public class MergeSort {

	// 6 5 4 3
	static void divide(int[] arr) {

		if (arr.length == 1) {
			return;
		}

		int[] left = new int[arr.length / 2];// 0 1 -->0 0 --> 6 5
		int[] right = new int[arr.length - left.length];// 0 1 --> 0 0 --> 4 3

		int i;

		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i++];
		}

		divide(left);
		System.out.println("LEFT : " + Arrays.toString(left));

		divide(right);
		System.out.println("Right : " + Arrays.toString(right));

		mergeSort(left, right, arr);

	}

	// 6 5 4 3
	// 5 6 4 3
//	-------------
//	5 6 4 3 
//	5 6 3 4 
//	
	static void mergeSort(int[] l, int[] r, int[] arr) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < l.length && j < r.length) {

			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}

		}

		while (i < l.length) {
			arr[k++] = l[i++];
		}

		while (j < r.length) {
			arr[k++] = r[j++];
		}

	}

	public static void main(String[] args) {

		System.out.println("main method strated ");
		int[] arr = { 6, 5, 4, 3 };

		divide(arr);

		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));

	}

}