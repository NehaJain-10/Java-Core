package com.strings;

public class CountDigit {

	public static void main(String[] args) {
		int count = 0;
		String st = "neha123 mic check 456";

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (Character.isDigit(ch)) {

				count++;

			}

		}
		System.out.println("Number of Digits in String: " + count);

	}

}
