package com.stringArray;

public class SortStringArray {

	public static void main(String[] args) {
		String[] arr = { "Pen", "Books", "Eraser", "Bag", "School" };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {

					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for (String s : arr) {
			System.out.println(s);
		}

	}

}
