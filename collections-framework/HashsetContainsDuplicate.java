package com.collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashsetContainsDuplicate {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);

		System.out.println(containsDuplicate(list));
	}

	public static boolean containsDuplicate(ArrayList<Integer> list) {

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {

			int num = list.get(i);

			if (set.contains(num)) {

				return true;

			}

			set.add(num);
		}

		return false;

	}

}
