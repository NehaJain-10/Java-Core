package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 5 elemnts of array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target Sum:");
		int target = sc.nextInt();

//		for(int i =0; i<arr.length; i++) {
//			for(int j =i+1; j<arr.length; j++) {
//				
//				if(arr[i] + arr[j] == target) {
//					System.out.println(i +" "+ j);
//					break;				}
//			}
//			
//		}
		TwoSum obj = new TwoSum();
		int[] ans = obj.twoSum(arr, target);

		System.out.println(ans[0] + " " + ans[1]);
		sc.close();

	}

	public int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			int current = nums[i];

			int required = target - current;

			if (map.containsKey(required)) {

				return new int[] { map.get(required), i };

			}

			map.put(current, i);
		}

		return new int[] {};
	}

}
