package com.strings;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");

		String str = sc.nextLine();

		countVowelsConsonants(str);

		sc.close();

	}

	public static void countVowelsConsonants(String str) {
		int vowel = 0, consonant = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = Character.toLowerCase(str.charAt(i));

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowel++;

				} else {
					consonant++;
				}
			}
		}

		System.out.println("Vowels: " + vowel);
		System.out.println("Consonants: " + consonant);

	}

}
