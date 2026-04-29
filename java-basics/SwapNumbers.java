package com.javaBasics;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 55;
		int b = 65;

//		int temp = a;
//		a= b;
//		b= temp;

		// without temp var
		a = a + b;
		b = a - b;
		a = a - b;

//		// with xor
//		a = a ^ b;
//		b = a ^ b;
//		a = a ^ b;

		System.out.println("Swapping of numbers: a = " + a + ", b= " + b);

	}

}
