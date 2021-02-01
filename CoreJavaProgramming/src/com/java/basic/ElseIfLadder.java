package com.java.basic;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		
		/*
		 * Program to find if the given number is a single digit or two digit or
		 * three digit or four digit or five digit numbers or greater
		 */
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number >= 0 && number < 10)
			System.out.println("Its a SINGLE digit");
		else if (number >= 10 && number < 100)
			System.out.println("Its a TWO digit");
		else if (number >= 100 && number < 1000)
			System.out.println("Its a THREE digit");
		else if (number >= 1000 && number < 10000)
			System.out.println("Its a FOUR digit");
		else if (number >= 10000 && number < 100000)
			System.out.println("Its a FIVE digit");
		else
			System.out.println("Its greater than 5 digits");
		
		System.out.println("---------------------");
		
		if(number >= 0 && number < 10)
			System.out.println("Its a SINGLE digit");
		if (number >= 10 && number < 100)
			System.out.println("Its a TWO digit");
		if (number >= 100 && number < 1000)
			System.out.println("Its a THREE digit");
		if (number >= 1000 && number < 10000)
			System.out.println("Its a FOUR digit");
		if (number >= 10000 && number < 100000)
			System.out.println("Its a FIVE digit");
		if (number >= 100000)
			System.out.println("Its greater than 5 digits");
		
		sc.close();
	}	

}
