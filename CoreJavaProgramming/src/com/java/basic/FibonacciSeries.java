package com.java.basic;



public class FibonacciSeries {

	public static void main(String[] args) {
		
		int limit = 20;
		boolean enterWhileLoop = true;
		int x = 1;
		int y = 2;
		System.out.println(x);
		System.out.println(y);
		/*
		for (int fibonacciNumber = 0; ; )
		{
			fibonacciNumber = x + y;
			if (fibonacciNumber < limit)
				System.out.println(fibonacciNumber);
			else
				break;
			x = y;
			y = fibonacciNumber;
		}*/
		int fibonacciNumber = 0;
		while(enterWhileLoop)
		{
			fibonacciNumber = x + y;
			if (fibonacciNumber < limit)
				System.out.println(fibonacciNumber);
			else
				enterWhileLoop = false;
			x = y;
			y = fibonacciNumber;
		}

		
	}

}
