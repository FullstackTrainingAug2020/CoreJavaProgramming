package com.java.basic;

public class ArrayExample {

	public static void main(String[] args) {
	  
		int intArray[] = {1,2,3,4,5,6,7,8,9,10};
		
		/*
		System.out.println("NUMBER AT POSITION 0: "+intArray[0]);
		System.out.println("NUMBER AT POSITION 1: "+intArray[1]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[2]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[3]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[4]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[5]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[6]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[7]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[8]);
		System.out.println("NUMBER AT POSITION 0: "+intArray[9]);*/

		int position = 0;
		while (position < intArray.length)
		{
			System.out.println("NUMBER: "+intArray[position]);
			position++;
		}
		
		for (int index = 0; index < intArray.length; index++)
		{
			System.out.println("NUMBER FOR LOOP: "+intArray[index]);
		}
		
		int index = 0;
		for (; index < intArray.length; )
		{
			System.out.println("NUMBER FOR LOOP: "+intArray[index]);
			index++;
		}
	}

}
