package com.stringArray;

import java.util.Scanner;

public class LongestString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of strings: ");
		int n = sc.nextInt();

		String[] arr = new String[n];
		System.out.println("Enter strings:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		String longest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i].length() > longest.length()) {
				longest = arr[i];
			}
		}
		System.out.println("Longest String: " + longest);
		sc.close();

	}

}
