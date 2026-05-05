package com.arrays;

import java.util.Scanner;

//Move all non-zero elements to front  
//Fill remaining positions with 0
public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter Elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int idx = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[idx] = arr[i];
				idx++;
			}
		}
		for (int i = idx; i < n; i++) {
			arr[i] = 0;
		}

		System.out.print("Result:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}

}
