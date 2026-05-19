package com.collections;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();

		st.push(5);
		st.push(10);
		st.push(15);
		st.push(20);
		st.push(25);
		st.push(30);

		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		System.out.println(st.peek());

		System.out.println(st.isEmpty());

		st.pop();
		st.pop();
		st.pop();
		st.pop();
		System.out.println(st);
		System.out.println(st.isEmpty());

	}

}
