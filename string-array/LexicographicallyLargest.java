package com.stringArray;

public class LexicographicallyLargest {

	public static void main(String[] args) {
		String[] arr = { "apple", "mango", "banana", "cherry" };

		String largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			//compareTo() → dictionary order comparison
			if (arr[i].compareTo(largest) > 0) { 
				largest = arr[i];
			}
		}
		System.out.println("Lexicographically Largest String is: " + largest);

	}

}
