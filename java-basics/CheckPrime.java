package com.javaBasics;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to Check Prime or not");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println("its Prime");
		} else {
			System.out.println("its NOT Prime");
		}

		sc.close();

	}

	private static boolean isPrime(int num) {

		if (num <= 1)
			return false;

//		for (int i = 2; i < num; i++) {
//			if (num % i == 0)
//				return false;
//		}

		for (int i = 2; i * i <= num; i++) { // iterate upto sqrt num only
			if (num % i == 0)
				return false;
		}
		return true;
	}

}
