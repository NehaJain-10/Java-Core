package com.collections;
//leetcode output -->0(index of first on repeating char)
import java.util.HashMap;
import java.util.Scanner;

public class HashmapFirstNonRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String");
		String s = sc.next();

		firstNonRepeatingChar(s);
		sc.close();
	}

	public static void firstNonRepeatingChar(String s) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else
				map.put(ch, 1);
		}
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if (map.get(c) == 1) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
