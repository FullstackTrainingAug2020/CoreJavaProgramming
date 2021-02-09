package com.oops.examples;

public class AdvancedCalculator extends Calculator{
	
	public int reminder(int a, int b)
	{
		return a%b;
	}

	public String addStrings(String a, String b)
	{
		return a+b;
	}
	
	
	public double divide(double a, double b) {
		System.out.println("ADVANCED CALCULATOR METHOD");
		return a/b;
	}
}
