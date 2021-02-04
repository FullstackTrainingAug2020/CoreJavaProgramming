package com.java.basic;

public class VowelsInAString {

	public static void main(String[] args) {
		
		/*

		String name = "FullstAck Programming";
		
		int countOfVowels = countVowels(name);
		*/
	
		//System.out.println("Vowels Count: "+ countVowels("FullStack Programming"));
		
		countVowels("FullStack Programming");

	}
	
	private static void countVowels(String name)
	{
		int count = 0;
		for(int i = 0; i < name.length(); i++)
		{
			char nameChar = name.charAt(i);
			if(nameChar == 'A' || nameChar == 'a' || nameChar == 'E' || nameChar == 'e' || nameChar == 'I' || nameChar == 'i' || 
					nameChar == 'O' || nameChar == 'o' || nameChar == 'U' || nameChar == 'u')
				count++;
		}
		
		System.out.println("Vowels Count: "+ count);
	}

}
