package com.javaBasics;

import java.util.Scanner;

public class FindLargestOf3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		int a = sc.nextInt();
		System.out.println("Enter b = ");
		int b = sc.nextInt();
		System.out.println("Enter c = ");
		int c = sc.nextInt();

//		if (a >= b && a >= c) {
//			System.out.println(a + " is greater");
//		} else if (b >= a && b >= c) {
//			System.out.println(b + " is greater");
//		} else {
//			System.out.println(c + " is greater");
//		}

		int max = a;

		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}

		System.out.println(max + " is greater");

		sc.close();

	}

}
