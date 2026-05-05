package com.arrays;

import java.util.Scanner;

//Input:  [1, 2, 3, 4]
//Output: [2, 3, 4, 1]
public class LeftRotateby1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elemnts of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int temp = arr[0];
		for (int i = 0; i <= n - 2; i++) {
			arr[i] = arr[i + 1];
		}
		arr[n - 1] = temp;
		System.out.println("Rotated by 1 left array is:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
