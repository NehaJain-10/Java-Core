package com.arrays;

public class IsArraySorted {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 8, 12, 59 };
		if (isSorted(arr)) {
			System.out.println("Array is sorted");
		} else {
			System.out.println("Array Not sorted");
		}

	}

	public static boolean isSorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false; // not sorted
			}

		}
		return true;// sorted
	}

}
