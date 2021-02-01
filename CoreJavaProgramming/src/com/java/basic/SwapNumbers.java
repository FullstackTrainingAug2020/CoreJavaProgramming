package com.java.basic;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("Value of A - "+a);
		System.out.println("Value of B - "+b);
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("AFTER SWAP");
		System.out.println("Value of A - "+a);
		System.out.println("Value of B - "+b);
	}

}
