package com.arrays;

public class SmallestElement {

	public static void main(String[] args) {
		int[] arr = { 50, 6, 7, 2, 5 };
		int small = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				small = arr[i];
			}
		}
		System.out.println("Smallest element: " + small);

	}

}
