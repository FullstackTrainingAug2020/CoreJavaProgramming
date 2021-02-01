package com.java.basic;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 11;
		System.out.println("GIVEN NUMBER IS: "+number);
		
		;  //null statement or its the end of a java statement
		
		for( int i=1; i <= number ; i++)
		/*
		 * for(int i=1; i <= number; i++)
		 *     	;
		 */
		{
			if(number%i == 0)
				System.out.println("FACTOR: "+i);
		}
		
		int j=1;		
		while(j <= number)
		{
			if (number%j == 0) {
					System.out.println("WHILE LOOP FACTOR:"+j);
			}
			
			j++;
		}

	}

}
