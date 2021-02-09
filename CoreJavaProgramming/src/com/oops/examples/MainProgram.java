package com.oops.examples;

public class MainProgram {
	public static void main(String[] args) {
		
		AdvancedCalculator advCalc = new AdvancedCalculator();
		
		System.out.println("ADDING TWO STRINGS: "+advCalc.addStrings("vamshi", "kiran"));
		System.out.println("ADDING TWO NUMBERS: "+advCalc.add(5,6));
		System.out.println("ADDING TWO NUMBERS: "+advCalc.divide(5,6));		
		
	}
}
