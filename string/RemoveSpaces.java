package com.strings;

import java.util.Scanner;

public class RemoveSpaces {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		//String result = "";

//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) != ' ') {
//				result = result + str.charAt(i);
//			}
//		}
		String result = str.replaceAll("\\s+", "");
		System.out.println("After removing spaces: " + result);

		sc.close();
	}

}
