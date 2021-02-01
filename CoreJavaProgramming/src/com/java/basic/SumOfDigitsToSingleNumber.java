package com.java.basic;

public class SumOfDigitsToSingleNumber {

	public static void main(String[] args) {
		
		int number = 10;
		
		int temp;
		
		int sum =0; 
		
		boolean continueOrNot = true;
		
		while(continueOrNot) {
			
			sum = 0;
			
			while (number > 0) {
				temp = number%10;
				sum = sum + temp;
				number = number/10;
			}
			
		if(sum < 10)
			continueOrNot = false;
		else
			number = sum;
		}
		
		System.out.println("FINAL SUM: "+sum);


	}

}
