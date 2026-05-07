package com.stringArray;

import java.util.Scanner;

public class CountVowelStringsArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[4];
		System.out.println("Enter the 4 Strings: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			char ch = Character.toLowerCase(arr[i].charAt(0));

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Strings starting with vowel: " + count);
		sc.close();

	}

}
