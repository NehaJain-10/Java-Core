package com.strings;

import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String st = sc.nextLine().toLowerCase();

		int[] freq = new int[26];

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				freq[ch - 'a']++;
			}
		}

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (ch >= 'a' && ch <= 'z' && freq[ch - 'a'] == 1) {
				System.out.println("First non-repeating: " + ch);
				return;
			}

		}
		System.out.println("No non-repeating character found");

		sc.close();

	}

}
