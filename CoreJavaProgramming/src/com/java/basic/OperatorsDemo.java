package com.java.basic;

public class OperatorsDemo {

	public static void main(String[] args) {
/*
 * 		ADDITION +
		SUBTRACT -
		MULTIPLY *
		DIVISION /  = QUOTIENT
		MOD		% 	= REMINDER
		
		INCREMENT ++
		DECREMENT --
		ASSIGNMENT OPERATOR =
 */

		double a = 10;
		int b = 3;
		
		double incrementValue;
		int decrementValue;
		
		System.out.println("ADDTION: "+ (a+b));
		System.out.println("SUBTRACTION: "+ (a-b));
		System.out.println("MUTIPLY: "+ (a*b));
		System.out.println("DIVISION: "+ (a/b));
		System.out.println("MOD: "+ (a%b));
		
		//incrementValue = a++; // Assignment and then increment
		
		//  a++  	a=a+1;
		// a--		a=a-1;
		
		incrementValue = ++a;  // increment and then assignment - Unary Operator, 
		
		System.out.println("POST INCREMENT: "+ incrementValue);
		System.out.println("VARIABLE A: "+ a);
		
		decrementValue = b--;
		//System.out.println("POST DECREMENT: "+ (a--));
		
		System.out.println("Decrement Value: "+ decrementValue);
		System.out.println("PRE DECREMENT: "+ b);
	}

}
