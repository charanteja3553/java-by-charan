package com.corejava1;

public class LeaderElement {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };

		for (int i = arr.length-1;i>=0; i--) {
			int leader = arr[i];
			for (int j = 0; j < i; j++) {
				if (leader > arr[j]) {
					System.out.print(leader+ " ");
				}
			}
		}
	}

}