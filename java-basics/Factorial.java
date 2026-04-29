package com.javaBasics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(factRecur(num));
		// factIterative(num);
		sc.close();

	}

	// using recursion factorial of number
	public static int factRecur(int n) {
		if (n == 0 || n == 1)
			return 1;

		return n * factRecur(n - 1);

	}
	// using Itreative factorial of number
//	public static void factIterative(int n) {
//	    
//	    int fac = 1;
//	    for(int i =1; i<=n; i++){
//	    	fac = fac*i;
//	    }
//	    System.out.println(fac);
//	    
//	    
//	}

}
