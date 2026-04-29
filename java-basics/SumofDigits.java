package com.javaBasics;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		int sum = 0;

		while (n != 0) {
			int digit = n % 10; // get last digit
			sum = sum + digit; // add to sum
			n = n / 10; // remove last digit
		}
		System.out.println("Sum of Digits: " + sum);
		sc.close();
	}

}
