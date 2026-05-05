
package com.arrays;

//Input:  [2, 3, 10, 6, 4, 8, 1]
//Output: 8   (10 - 2)
public class MaxDifference {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 10, 6, 4, 8, 1 };

		int min = arr[0];
		int maxDiff = 0;

		for (int i = 1; i < arr.length; i++) {
			int currDiff = arr[i] - min;
			maxDiff = Math.max(maxDiff, currDiff);
			min = Math.min(min, arr[i]);
		}

		System.out.println(maxDiff);

	}

}
