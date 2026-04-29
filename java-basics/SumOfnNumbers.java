package com.javaBasics;

import java.util.Scanner;

public class SumOfnNumbers {

	public static void main(String[] args) {

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();

		sc.close();
//      Time Complexity O(n)
//		if (num < 1) {
//			System.out.println("Please enter a positive number");
//		} else {
//			for (int i = 1; i <= num; i++) {  
//				sum = sum + i;
//			}
//			System.out.println("Sum of first " + num + " Numbers is :" + sum);
//
//		}
		sum = (num * (num + 1)) / 2; // O(1)
		System.out.println("Sum of first " + num + " Numbers is :" + sum);

	}

}
