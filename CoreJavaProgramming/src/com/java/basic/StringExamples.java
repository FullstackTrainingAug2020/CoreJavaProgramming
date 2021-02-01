package com.java.basic;

public class StringExamples {

	public static void main(String[] args) {
	
		String name = "Snehith";
		String charString = "d";
		
		char character = '%';		
		int charValue = character;
		
		String strVal = "123";
		
		int strValue = Integer.parseInt(strVal);
		
		System.out.println("ASCII CODE of Character: "+character+" is "+charValue);
		
		System.out.println("Integer value of the String: "+strVal+" is "+strValue);
		
		if(name.indexOf('v') == -1)
			System.out.println("Character is present in the string: "+name.indexOf('v'));
		
		for(int position =0; position < name.length() ; position++)
		{
			System.out.println(name. charAt(position));
		}
		
		System.out.println("UPPERCASE: "+name.toUpperCase());
		System.out.println("lowercase: "+name.toLowerCase());

	}

}
