package com.java.basic;

public class ElseIfLadderDemo {

	public static void main(String[] args) {

		int number = 1;
		
		/*
		if(number < 10)
			System.out.println(number+ " LESS THAN 10");
		else if(number < 15)
			System.out.println(number+ " LESS THAN 15");
		else if(number < 20)
			System.out.println(number+ " LESS THAN 20");
		else if(number < 25)
			System.out.println(number+ " LESS THAN 25");
		else
			System.out.println(number+ " GREATER THAN or EQUAL to 25");
		*/
		if(number < 25)
			System.out.println(number+ " LESS THAN 25");
		else if(number < 20)
			System.out.println(number+ " LESS THAN 20");
		else if(number < 15)
			System.out.println(number+ " LESS THAN 15");
		else if(number < 10)
			System.out.println(number+ " LESS THAN 10");
		else
			System.out.println(number+ " GREATER THAN or EQUAL to 25");
		
	}

}
