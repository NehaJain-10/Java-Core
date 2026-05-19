package leetcode;

import java.util.Scanner;
import java.util.Stack;

//Input: [100, 80, 60, 70, 60, 75, 85]
//Output: [1,1,1,2,1,4,6]


public class StockSpan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");

        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter stock prices:");

        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        int[] ans = stockSpan(arr);

        for(int val : ans) {

            System.out.print(val + " ");

        }

        sc.close();
    }

    public static int[] stockSpan(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int[] ans = new int[arr.length];

        // Traverse LEFT to RIGHT
        for(int i = 0; i < arr.length; i++) {

            // Remove smaller/equal elements
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) {

                st.pop();

            }

            // If no greater element on left
            if(st.isEmpty()) {

                ans[i] = i + 1;

            }

            // Previous greater element exists
            else {

                ans[i] = i - st.peek();

            }

            // Push current index
            st.push(i);
        }

        return ans;
	}

}
