package com.strings;

import java.util.Scanner;

public class ReplaceVowels {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");

		String str = sc.nextLine();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (isVowel(ch)) {
				result.append('*'); //Replace Vowels with *
			} else {
				result.append(ch);
			}
		}

		System.out.println("Result: " + result.toString());

		sc.close();
	}

	public static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);

		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

}
