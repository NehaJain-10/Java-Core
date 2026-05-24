package com.collections;
//abcabcbb,  output--> 3

import java.util.HashSet;
import java.util.Scanner;

public class HashsetLongestSubstringWithoutRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String:");

		String s = sc.next();

		System.out.println(longestSubstring(s));

		sc.close();
	}

	public static int longestSubstring(String s) {

		HashSet<Character> set = new HashSet<>();

		int left = 0;

		int maxLength = 0;

		for (int right = 0; right < s.length(); right++) {

			char ch = s.charAt(right);

			// Duplicate found
			while (set.contains(ch)) {

				set.remove(s.charAt(left));

				left++;
			}

			// Add current character
			set.add(ch);

			// Update max length
			maxLength = Math.max(maxLength, right - left + 1);
		}

		return maxLength;

	}

}
