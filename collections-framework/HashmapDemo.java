package com.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of students:");
		int n = sc.nextInt();

		sc.nextLine();

		for (int i = 0; i < n; i++) {

			System.out.println("Enter student id:");
			int id = sc.nextInt();

			sc.nextLine();

			System.out.println("Enter student name:");
			String name = sc.nextLine();

			map.put(id, name);
		}

		System.out.println("Key Value pairs - " + map);
		System.out.println("Print value of 2nd key - " + map.get(2));
		System.out.println(map.containsKey(3));
		map.remove(1);
		System.out.println("After Deleting key 1 - " + map);
		sc.close();

	}

}
