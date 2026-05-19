package com.collections;

import java.util.Stack;

public class StackRemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String str = "abbaca";
		
		System.out.println(removeDuplicates(str));

	}
	public static String removeDuplicates(String s) {
		
		Stack<Character> st = new Stack<>();
		
		for(int i =0; i<s.length(); i++) {
			char ch =s.charAt(i);
			
			if(!st.isEmpty() && st.peek() == ch) {
				st.pop();
			}
			else {
			st.push(ch);
			}
		}
			String ans = "";

	        while(!st.isEmpty()) {

	            ans = st.pop() + ans;

	        }

	        return ans;
		
	}

}
