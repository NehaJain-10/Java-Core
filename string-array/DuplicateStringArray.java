package com.stringArray;

public class DuplicateStringArray {

	public static void main(String[] args) {
		String[] arr = { "java", "python", "dsa", "python", "java" };

		System.out.println("Duplicate Strings:");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
