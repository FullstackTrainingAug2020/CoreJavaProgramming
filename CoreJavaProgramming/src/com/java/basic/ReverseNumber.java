package com.java.basic;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 1234;
		System.out.println("REVERSE NUMBER: " + reverse(number));
		System.out.println("SUM OF DIGITS OF A NUMBER: " + sumOfDigits(number));
	}

	private static int reverse(int number) {
		int temp;
		int reverseNumber = 0;

		while (number > 0) {
			temp = number % 10;
			reverseNumber = reverseNumber * 10 + temp;
			number = number / 10;
		}

		return reverseNumber;
	}

	private static int sumOfDigits(int number) {
		int temp;
		int sum = 0;

		while (number > 0) {
			temp = number % 10;
			sum = sum + temp;
			number = number / 10;
		}

		return sum;
	}

}
