package leetcode;
//Input: [100, 4, 200, 1, 3, 2]

//Output: 4

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class LongConsecutiveSequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array:");
		int n = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Enter the Elements:");
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}

		System.out.println(longConsecutiveSeq(list));
		sc.close();
	}

	public static int longConsecutiveSeq(ArrayList<Integer> list) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {
			int nums = list.get(i);

			set.add(nums);
		}

		int longest = 0;

		// Step 2: Traverse list
		for (int i = 0; i < list.size(); i++) {

			int num = list.get(i);

			// Check if current number is START of sequence
			if (!set.contains(num - 1)) {

				int currentNum = num;
				int currentLength = 1;

				// Count consecutive numbers
				while (set.contains(currentNum + 1)) {

					currentNum++;
					currentLength++;

				}

				// Update longest length
				if (currentLength > longest) {

					longest = currentLength;

				}
			}
		}

		return longest;

	}

}
