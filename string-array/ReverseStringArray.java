package com.stringArray;


public class ReverseStringArray {

	public static void main(String[] args) {
		String[] arr = { "Neha", "Java", "DSA" };

		int left = 0;
		int right = arr.length - 1;

		while (left < right) {

			String temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;

			left++;
			right--;
		}

		System.out.println("Reversed String Array:");

		for (String s : arr) {
			System.out.print(s + " ");
		}

	}

}
