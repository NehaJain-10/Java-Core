package com.arrays;

import java.util.Scanner;

//Input:  [1, 1, 2, 2, 3]
//Output: [1, 2, 3]
public class RemoveDuplicatesSorted {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elemnts of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int slow = 0;

		for (int i = 1; i < n; i++) {
			if (arr[i] != arr[slow]) {
				slow++;
				arr[slow] = arr[i];
			}
		}

		System.out.println("Array after removing duplicates:");
		for (int i = 0; i <= slow; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
