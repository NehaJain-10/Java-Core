package leetcode;

import java.util.Scanner;
import java.util.Stack;

//Input: [2,1,2,4,3] here for 3 there is no greater element in right side so print -1, like this...    
//Output:[4,2,4,-1,-1]
public class NextGreaterElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");

		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = nextGreaterEle(arr);

		for (int val : result) {

			System.out.print(val + " ");
		}
		sc.close();

	}

	public static int[] nextGreaterEle(int[] arr) {
		Stack<Integer> st = new Stack<Integer>();
		int[] ans = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!st.isEmpty() && st.peek() <= arr[i]) {
				st.pop();
			}

			if (st.isEmpty()) {
				ans[i] = -1;
			}

			else {
				ans[i] = st.peek();
			}
			st.push(arr[i]);

		}
		return ans;
	}

}
