package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSum {

	public static void main(String[] args) {
		int sum = 0;
		ArrayList<Integer> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of elements:");
		int n = sc.nextInt();

		System.out.println("Enter the array elements:");

		for (int i = 0; i < n; i++) {

			list.add(sc.nextInt());

		}

		System.out.println(list);

//		for (int i = 0; i < list.size(); i++) {
//			sum += list.get(i);
//		}

		for (int num : list) {
			sum += num;
		}

		System.out.println("Summation = " + sum);
		
		sc.close();

	}

}
