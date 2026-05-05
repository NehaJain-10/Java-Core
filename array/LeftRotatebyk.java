package com.arrays;

import java.util.Scanner;

public class LeftRotatebyk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elemnts of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the value of k: ");
		int k = sc.nextInt();

		// Step 0: normalize k
		k = k % n;

		// Step 1: reverse first k elements
		reverse(arr, 0, k - 1);

		// Step 2: reverse remaining elements
		reverse(arr, k, n - 1);

		// Step 3: reverse whole array
		reverse(arr, 0, n - 1);

		// Print result
		System.out.print("Rotated array: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

	// Helper method to reverse part of array
	public static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

}
