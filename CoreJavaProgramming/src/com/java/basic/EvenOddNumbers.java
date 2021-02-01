package com.java.basic;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {

		int number;
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		if(number%2 == 0) {
			System.out.println(number+ " is EVEN");
		}
		else
		{
			System.out.println(number+ " is ODD");
		}
		sc.close();
	}

}
