package com.collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		System.out.println("Enter the array elements:");

		for (int i = 0; i < n; i++) {

			list.add(sc.nextInt());

		}

		System.out.println(list);
		System.out.println("Second Indexed Element: " + list.get(2));
		list.set(1, 100);
		System.out.println("Updated first Indexed Element: " + list);
		list.remove(3);
		System.out.println("Removed Third Indexed Element: " + list);

		sc.close();

	}

}
