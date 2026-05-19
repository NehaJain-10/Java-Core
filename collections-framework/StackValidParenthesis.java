package com.collections;

import java.util.Stack;

public class StackValidParenthesis {

	public static void main(String[] args) {

		String s = "({[]})";
		System.out.println(checkValidParenthesis(s));

	}

	public static boolean checkValidParenthesis(String s) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			} else {

				if (st.isEmpty()) {
					return false;
				}
				if (ch == ')' && st.peek() == '(') {
					st.pop();
				}

				else if (ch == ']' && st.peek() == '[') {
					st.pop();

				}

				else if (ch == '}' && st.peek() == '{') {
					st.pop();
				} else {

					return false;

				}
			}
		}
		return st.isEmpty();
	}

}
