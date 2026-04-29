package com.javaBasics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check palindrome:");
		int n = sc.nextInt();
		int original = n;
		int rev = 0;

		while (n != 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
		}

		if (original == rev) {
			System.out.println("Its palindrome: " + rev);
		} else {
			System.out.println("Not palindrome: " + rev);

		}

		sc.close();
	}

}
