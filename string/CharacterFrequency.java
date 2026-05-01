package com.strings;

import java.util.Scanner;

public class CharacterFrequency {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");

		String str = sc.nextLine();

		int freq[] = new int[26];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.toLowerCase().charAt(i);
			if(ch>= 'a' && ch <='z')
			freq[ch - 'a']++;

		}

		for (int i = 0; i < 26; i++) {
			if (freq[i] > 0) {
				System.out.println((char) (i + 'a') + "--> " + freq[i]);
			}
		}
		sc.close();
		

	}

}
