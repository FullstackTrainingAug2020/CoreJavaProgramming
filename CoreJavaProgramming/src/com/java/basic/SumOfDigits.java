package com.java.basic;

public class SumOfDigits {

	public static void main(String[] args) {
	 
		int number = 1234;
		
		int temp;
		
		int sum = 0; 
		
		while (number > 0) {
			temp = number%10;
			sum = sum + temp;
			System.out.println("SUM: "+sum);
			number = number/10;
			System.out.println("NUMBER: "+number);
		}
		/*
		number = 4536;
		sum = 0;
		
		for(;number>0; number = number/10) {
			sum += number%10;  //sum = sum + number%10;
		}
		System.out.println("SUM: "+sum);*/
	}
}
