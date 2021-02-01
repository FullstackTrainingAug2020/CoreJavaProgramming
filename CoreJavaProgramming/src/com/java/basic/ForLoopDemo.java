package com.java.basic;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		int sum = 0;
		


		System.out.println("SUM OF 10 NUMBERS: "+sum);
		
		System.out.println("BELOW IS THE RESULT OF FOR LOOP");
		sum = 0;
		/* for (initialization; condition ; increment/decrement)
		{
			LOOP BLOCK
		}*/
		for (int number=1; number <= 1000; number++)
		{	
			sum = sum + number;
		}
		System.out.println("SUM : "+ sum);

	}

}
