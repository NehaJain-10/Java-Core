package com.collections;

import java.util.Scanner;
import java.util.Stack;

public class StackReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();

		System.out.println(reverseStr(str));
		sc.close();

	}

	public static String reverseStr(String str) {
		Stack<Character> s = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			s.push(str.charAt(i));
		}

		String ans = "";
		while (!s.isEmpty()) {
			ans += s.pop();
		}

		return ans;
	}

}
