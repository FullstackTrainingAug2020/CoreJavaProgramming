package com.java.basic;

public class SumAndProductOfArrays {

	public static void main(String[] args) {
	
		int intArray[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		int product = 1;
		
		/*
		sum = sum + intArray[0];
		sum = sum + intArray[1];
		sum = sum + intArray[2];
		sum = sum + intArray[3];
		sum = sum + intArray[4];
		sum = sum + intArray[5];
		sum = sum + intArray[6];
		sum = sum + intArray[7];
		sum = sum + intArray[8];
		sum = sum + intArray[9];
		
		product = product * intArray[0];
		product = product * intArray[1];
		product = product * intArray[2];
		product = product * intArray[3];
		product = product * intArray[4];
		product = product * intArray[5];
		product = product * intArray[6];
		product = product * intArray[7];
		product = product * intArray[8];
		product = product * intArray[9];*/
		
		//sum = intArray[0] + intArray[1] + intArray[2] + intArray[3] + intArray[4] + intArray[5] + intArray[6] + intArray[7] + intArray[8] + intArray[9] ;
		
		for (int index = 0; index < intArray.length; index++)
		{
			sum = sum+intArray[index];
			product = product * intArray[index];
		}
		
		System.out.println("SUM OF INTEGERS: "+sum);
		System.out.println("PRODUCT OF INTEGERS: "+product);
	}

}
