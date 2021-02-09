package com.java.basic;

public class StringReverse {

	public static void main(String[] args) {
		String name = "level";
		
		/*
		String outputStr = reverse(name);
		isPalindromeString(name, outputStr);	*/
		
		isPalindromeString(name, reverse(name));
		// isPalindromeString(name, reverse);
	}
	
	private static String reverse(String name) {
		String reverse = "";
		for(int charPos = name.length() - 1; charPos >= 0; charPos--) {			
			reverse += name.charAt(charPos);
		}
		return reverse;
	}
	
	private static void isPalindromeString(String name, String reverseName) {
		if(reverseName.equals(name))
		{
			System.out.println("String is palindrome");
		}
	}
}
