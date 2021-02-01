package com.java.basic;

public class StringOperations {

	public static void main(String[] args) {

		String strOne = "Vamshi";
		String strTwo = "Kiran";
		
		if(strOne == strTwo)
			System.out.println("STRINGS EQUAL");
		else
			System.out.println("STRINGS NOT EQUAL");
		
		if(strOne.equals(strTwo))
			System.out.println("STRINGS EQUAL");
		else
			System.out.println("STRINGS NOT EQUAL");

		
		if(strOne.equalsIgnoreCase(strTwo))
			System.out.println("STRINGS EQUAL");
		else
			System.out.println("STRINGS NOT EQUAL");
		
		System.out.println("Combined String: "+strOne.concat(strTwo));
		
		System.out.println("String One: "+strOne);
		System.out.println("String Two: "+strTwo);
	}

}
