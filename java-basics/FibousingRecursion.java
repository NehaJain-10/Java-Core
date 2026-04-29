package com.javaBasics;

import java.util.Scanner;

public class FibousingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++)
			System.out.println(fibo(i) + " ");

		sc.close();
	}

	public static int fibo(int n) {
		if (n <= 1)

			return n;

		return fibo(n - 1) + fibo(n - 2);

	}

}
