package com.stringArray;

public class ReverseEachString {

	public static void main(String[] args) {

		String[] arr = { "java", "python", "code" };

		for (int i = 0; i < arr.length; i++) {

			String reversed = new StringBuilder(arr[i]).reverse().toString();

			arr[i] = reversed;
		}

		System.out.println("Reversed Strings:");

		for (String s : arr) {
			System.out.println(s);
		}

	}

}
