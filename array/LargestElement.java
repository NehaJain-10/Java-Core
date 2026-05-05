package com.arrays;

public class LargestElement {

	public static void main(String[] args) {

		int[] arr = { 5, 1, 7, 101, 2 };

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest Element is: " + max);

	}

}
