package com.javaBasics;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n = sc.nextInt();

		printFibo(n);

		sc.close();

	}

	public static void printFibo(int n) {

		int a = 0;
		int b = 1;

		if (n >= 1) {
			System.out.print(a + " ");
		}
		if (n >= 2) {
			System.out.print(b + " ");
		}

		for (int i = 2; i < n; i++) {
			int c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
