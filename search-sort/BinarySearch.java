package com.searchsort;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter sorted array elements:");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter target element: ");
		int target = sc.nextInt();

		boolean found = false;

		int low = 0;
		int high = n - 1;
		while (low <= high) {

			int mid = (low + high) / 2;

			if (arr[mid] == target) {
				System.out.println("Found at Index: " + mid);
				found = true;
				break;
			}

			else if (target > arr[mid]) {
				low = mid + 1;
			}

			else {
				high = mid - 1;
			}

		}
		if (!found) {
			System.out.println("Element not found");
		}

		sc.close();
	}

}
