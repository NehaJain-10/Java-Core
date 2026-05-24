package com.collections;

import java.util.HashSet;
import java.util.Scanner;

public class HashsetLongestPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String:");

		String s = sc.next();

		System.out.println(longestPalindrome(s));
		sc.close();

	}

	public static int longestPalindrome(String s) {
		HashSet<Character> set = new HashSet<>();
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) {
				set.remove(ch);
				length += 2;
			} else {
				set.add(ch);
			}
		}

		if (!set.isEmpty()) {
			length += 1;
		}
		return length;
	}

}
