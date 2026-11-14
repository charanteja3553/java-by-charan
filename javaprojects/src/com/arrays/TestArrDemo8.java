package com.arrays;

import java.util.Arrays;

//WAP to print Two Arrays data elements into one Array.
public class TestArrDemo8 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 10, 20, 30, 40 };

		int[] c = new int[a.length + b.length];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[a.length + i] = b[i];
		}

		System.out.println(Arrays.toString(c));

	}
}