package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMaxElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();

		System.out.println("Enter the array elements:");

		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);
		int max = list.get(0);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
			}
		}
		System.out.println(max);

		sc.close();

	}

}
