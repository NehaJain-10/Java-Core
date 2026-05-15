package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashmapFreqCount {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array:");
		int n = sc.nextInt();
		System.out.println("Enter the Elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list);

		freqCnt(list);
		sc.close();

	}

	public static void freqCnt(ArrayList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < list.size(); i++) {
			int nums = list.get(i);
			if (map.containsKey(nums)) {
				map.put(nums, map.get(nums) + 1);
			} else {

				map.put(nums, 1);
			}
		}
		//System.out.println("frequeny count of elements: " + map);
		for(Integer key : map.keySet())
		{
		    System.out.println(key + " -> " + map.get(key));
		}
	}

}
