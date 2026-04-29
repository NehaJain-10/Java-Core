package com.javaBasics;

import java.lang.Math;

public class PrintPrimes {

	public static void main(String[] args) {
		int count = 0;
		int num = 2;

		while (count < 50) {
			if (primeFirst50(num)) {
				System.out.print(num + ", ");
				count++;
			}
			num++;
		}

	}

	public static boolean primeFirst50(int num) {

		if (num <= 1)
			return false;

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				return false;
		}

		return true;
	}

}
