package com.stringArray;

public class CountTotalCharacters {

	public static void main(String[] args) {
		String[] arr = { "java", "hi", "coding" };
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i].length();
		}
		System.out.println("Total number of characters: " + sum);

	}

}
