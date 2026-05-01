package com.strings;

import java.util.Arrays;

public class Anagrams {
	public static void main(String[] args) {

		String s1 = "Neha", s2 = "a    Neh";

		if (isAnagram(s1, s2)) {
			System.out.println("is Anagram");
		} else {
			System.out.println("Not anagram");
		}

	}

	public static boolean isAnagram(String s1, String s2) {
		s1 = s1.replaceAll("\\s", "").toLowerCase();
		s2 = s2.replaceAll("\\s", "").toLowerCase();

		if (s1.length() != s2.length())
			return false;

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);

	}

}
