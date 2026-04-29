package com.javaBasics;

public class ArmStrong {
	
	
	public static void main(String[] args) {
		
		int num = 153;
		int original = num;
		int count =0;
		
		int temp = num;
		//Count digits
		while(temp != 0) {
			count++;
			temp =temp/10;
		}
		
		int sum =0;
		temp = num;
		//Calculate Armstrong sum
		while(temp!=0) {
			int digit = temp% 10;
			sum += Math.pow(digit, count);
			temp = temp/10;
			
		}
		
		if(sum == original) {
			System.out.println("it is armstrong number");
		} else {
			System.out.println("NOt armstrong");
		}
		
		
	}

}
