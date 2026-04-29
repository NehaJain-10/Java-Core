package com.javaBasics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {

		System.out.println("Enter Number for reversing:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		sc.close();
		reverse(num);

	}

	public static void reverse(int num) {
		int rev = 0;

		while (num != 0) {

			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}

		System.out.println("Reversed number: " + rev);
	}

}
