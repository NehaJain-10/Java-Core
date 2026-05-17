package leetcode;

import java.util.HashSet;

public class IntersectionTwoArr {

	public static void main(String[] args) {
		int arr1[] = { 1, 1, 2, 2, 1 };
		int arr2[] = { 2, 2, 3, 2 };

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			int nums = arr1[i];

			set.add(nums);

		}

		HashSet<Integer> result = new HashSet<>();
		for (int i = 0; i < arr2.length; i++) {
			int res = arr2[i];
			if (set.contains(res)) {
				result.add(res);
			}
		}

		System.out.println(result);

	}

}
