package com.arrays;

import java.util.Scanner;

public class MergeTwoSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of Array1: ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];

		System.out.println("Enter elements of Array1:");
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.print("Enter size of Array2: ");
		int m = sc.nextInt();
		int[] arr2 = new int[m];

		System.out.println("Enter elements of Array2:");
		for (int i = 0; i < m; i++) {
			arr2[i] = sc.nextInt();
		}

		int[] result = new int[n + m];

		int i = 0, j = 0, k = 0;

		// merge
		while (i < n && j < m) {
			if (arr1[i] < arr2[j]) {
				result[k++] = arr1[i++];
			} else {
				result[k++] = arr2[j++];
			}
		}

		// remaining arr1
		while (i < n) {
			result[k++] = arr1[i++];
		}

		// remaining arr2
		while (j < m) {
			result[k++] = arr2[j++];
		}

		// print result
		System.out.println("Merged array:");
		for (int x = 0; x < result.length; x++) {
			System.out.print(result[x] + " ");
		}

		sc.close();
	}
}