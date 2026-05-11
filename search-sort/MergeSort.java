package com.searchsort;

import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] arr, int low, int high) {

		if (low < high) {

			int mid = (low + high) / 2;

			// Divide left half
			mergeSort(arr, low, mid);

			// Divide right half
			mergeSort(arr, mid + 1, high);

			// Merge sorted halves
			merge(arr, low, mid, high);
		}
	}

	public static void merge(int[] arr, int low, int mid, int high) {

		int[] temp = new int[high - low + 1];

		int i = low;
		int j = mid + 1;
		int k = 0;

		// Compare and merge
		while (i <= mid && j <= high) {

			if (arr[i] <= arr[j]) {

				temp[k] = arr[i];
				i++;

			} else {

				temp[k] = arr[j];
				j++;
			}

			k++;
		}

		// Remaining left elements
		while (i <= mid) {

			temp[k] = arr[i];
			i++;
			k++;
		}

		// Remaining right elements
		while (j <= high) {

			temp[k] = arr[j];
			j++;
			k++;
		}

		// Copy back to original array
		for (int x = 0; x < temp.length; x++) {

			arr[low + x] = temp[x];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of array: ");
		int n = sc.nextInt();

		int[] arr = new int[n];

		System.out.println("Enter array elements:");

		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}

		mergeSort(arr, 0, n - 1);

		System.out.println("Sorted array:");

		for (int num : arr) {

			System.out.print(num + " ");
		}

		sc.close();

	}

}
