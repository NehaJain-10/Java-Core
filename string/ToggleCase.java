package com.strings;

public class ToggleCase {

	public static void main(String[] args) {
		String st = "naTURE";

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);

			if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);

			} else if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			}
			result.append(ch);
		}
		System.out.println("Toggling String: " + result);

	}

}
