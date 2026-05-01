package com.strings;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String ");
		String st = sc.nextLine().toLowerCase();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (result.indexOf(String.valueOf(ch)) == -1) {
				result.append(ch);
			}

		}

		System.out.println("String after Removing Duplicates:" + result);
		sc.close();

	}

}
