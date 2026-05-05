package com.arrays;

//Input:  [1, 2, 3, 2, 1]
//Output: Palindrome
public class CheckPalindromeArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2,1};
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] != arr[right]) {
				System.out.println("Its not Palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println("Its Palindrome");

	}

}
