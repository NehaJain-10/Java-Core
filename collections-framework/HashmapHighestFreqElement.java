package com.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class HashmapHighestFreqElement {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(2);
		
		System.out.println(list);
		highestFreq(list);

	}
	
	public static void highestFreq(ArrayList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i= 0; i<list.size(); i++) {
			int nums = list.get(i);
			if(map.containsKey(nums)) {
			map.put(nums,map.get(nums)+1);
			}
			else {

				map.put(nums, 1);
			}
		}
		int maxFreq =0;
		int ans =-1;
		
		for(Integer key : map.keySet()){
			if(map.get(key) > maxFreq) {
				maxFreq = map.get(key);
				ans= key;
			}
		}
		
		System.out.println("Highest frequency element = " + ans);
        System.out.println("Frequency = " + maxFreq);}

}
