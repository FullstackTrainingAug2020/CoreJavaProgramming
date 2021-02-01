package com.java.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1234;
		
		int temp;
		
		int reverseNumber = 0; 
		
		while (number > 0) {
			temp = number%10;
			
			reverseNumber = reverseNumber * 10 + temp;
			
			number = number/10;
		}
		
		System.out.println("REVERSE NUMBER: "+reverseNumber);
	}

}
