package com.strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string to check Palindrome:");
		String str = sc.nextLine();

		if (isPalindrome(str)) {
			System.out.println("It's palindrome");
		} else {
			System.out.println("It's not palindrome");
		}

		sc.close();

	}

	public static boolean isPalindrome(String str) {
		str = str.replaceAll("\\s+", "").toLowerCase();
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {

			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}

			left++;
			right--;
		}
		return true;
	}

}
