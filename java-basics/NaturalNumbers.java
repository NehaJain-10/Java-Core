package com.javaBasics;

import java.util.Scanner;

public class NaturalNumbers {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= num; i++) {
			System.out.print(i + " ");

		}

	}

}
