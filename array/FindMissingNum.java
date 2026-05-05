package com.arrays;

import java.util.Scanner;

//Input:  [1, 2, 4, 5]
//Output: 3
public class FindMissingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elemnts of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		int total = (n + 1) * (n + 2) / 2;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += arr[i];
		}

		int missing = total - sum;
		System.out.println("Missing number: " + missing);

		sc.close();

	}
}
