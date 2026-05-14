package com.collections;

import java.util.ArrayList;

public class ArrayListSecondMax {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(5);
		list.add(10);
		list.add(50);
		list.add(25);
		list.add(45);

		int largest = list.get(0);
		int sec = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > largest) {
				sec = largest;
				largest = list.get(i);

			} else if (list.get(i) > sec && list.get(i) != largest) {
				sec = list.get(i);
			}

		}
		System.out.println("Largest: " + largest);
		System.out.println("second Largest: " + sec);

	}

}
