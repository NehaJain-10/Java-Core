package com.arrays;

import java.util.Scanner;

public class ReverseElements {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elements of Array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int left = 0;
		int right = n - 1;

		while (left < right) {
			int swap = arr[left];
			arr[left] = arr[right];
			arr[right] = swap;

			left++;
			right--;
		}
		System.out.println("Reversed array:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();

	}

}
