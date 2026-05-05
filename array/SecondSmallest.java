package com.arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int[] arr = { 5, 6, 88, 9, 0 };
		int small = Integer.MAX_VALUE;
		int secSmall = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < small) {
				secSmall = small;
				small = arr[i];
			} else if (arr[i] > small && arr[i] < secSmall) {
				secSmall = arr[i];
			}
		}
		System.out.println("second Smallest: " + secSmall);
	}

}
