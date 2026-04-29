package com.javaBasics;

import java.util.Scanner;

public class CheckOddEven {
	// static int n = 333;
	public static void oddEven(int n) {
		if (n % 2 == 0) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Check Odd or Even");
		int num = sc.nextInt();
        oddEven(num);
		sc.close();
	}
}
