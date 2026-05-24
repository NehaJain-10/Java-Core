package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapValidAnagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string one:");
		String s1 = sc.next();

		System.out.println("enter the string two:");
		String s2 = sc.next();

		if (vaildAnagram(s1, s2)) {
			System.out.println("its anagram");
		} else {
			System.out.println("not a anagram");
		}
		sc.close();

	}

	public static boolean vaildAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			Character ch = s1.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		for (int i = 0; i < s2.length(); i++) {
			Character c = s2.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) - 1);
			} else {
				return false;
			}

			if (map.get(c) == 0) {
				map.remove(c);
			}
		}

		return map.isEmpty();
	}

}
