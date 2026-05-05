package com.arrays;

import java.util.Scanner;

//Input:  [1, 2, 3, 4]
//Output: [4, 1, 2, 3]
public class RightRotateby1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}

		int temp = arr[n - 1];

		for (int i = n - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		System.out.println("Right Rotated by 1 array is:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
