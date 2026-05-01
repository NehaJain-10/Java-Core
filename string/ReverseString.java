package com.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String str = sc.nextLine();
//		int n = str.length();
//		String rev = "";
//
//		for (int i = n - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println("Reversed String: " + rev);
		
		String revs = new StringBuilder(str).reverse().toString();
		System.out.println(revs);

		sc.close();

	}

}
