package com.java.basic;

public class CountDigitsOfANumber {

	public static void main(String[] args) {
		
		int number = 5864212;
		int count;
		
		System.out.println("GIVEN Number: "+number);
		/*
		while (number > 0)
		{
			number = number/10;
			System.out.println("Inside loop, Number: "+number);
			count++;
		}*/
		
		for (count = 0; number > 0; count++)
		{
			number = number/10;
		}
			
		System.out.println("Number of the digits in the given number: "+count);
	}

}
