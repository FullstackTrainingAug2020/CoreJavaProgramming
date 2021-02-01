package com.java.basic;

public class EmptyForLoopExample {

	public static void main(String[] args) {
		int intArray[] = {34, 67, 81, 97, 45, 54, 90, 83};
		
		for (int i = 0; i < intArray.length; i++)
			System.out.println(intArray[i]);
		
		for (int j=0; j < intArray.length; j++)
			; // null statement
		
		for (int j=0; j < intArray.length; j++);
		
		;

	}

}
