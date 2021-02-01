package com.java.basic;

public class EvenNumbersCountInArray {

	public static void main(String[] args) {
		int intArray[] = {34, 67, 81, 97, 45, 54, 90, 83};
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int i=0; i < intArray.length ; i++)
		{
			if (intArray[i]%2 != 0) 
			{
				oddCount++;
			}
			else
			{
				evenCount++;
			}
		}
		
		System.out.println("Number of EVEN Numbers: "+evenCount);
		System.out.println("Number of ODD Numbers: "+oddCount);
	}

}
