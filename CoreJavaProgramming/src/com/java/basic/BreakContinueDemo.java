package com.java.basic;

public class BreakContinueDemo {

	public static void main(String[] args) {
		int sum = 0;
		int number;
		for (number=1; number <= 1000; number++)
		{	
			sum = sum + number;
			if(sum > 100000)
				break;
		}
		System.out.println("NUMBER : "+number);
		System.out.println("SUM : "+ sum);
	}
}
