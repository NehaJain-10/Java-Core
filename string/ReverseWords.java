package com.strings;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");

		String st = sc.nextLine();

		String[] arr = st.split("\\s+"); // it handles multiple spaces in between words

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();

	}

}
