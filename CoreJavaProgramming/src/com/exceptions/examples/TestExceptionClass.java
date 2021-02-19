package com.exceptions.examples;

public class TestExceptionClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int firstVar = 10;
		
		int secondVar = 0;
		
		try {
			int divisionResult = firstVar/secondVar;
			System.out.println("DIVISION RESULT: "+divisionResult);
		}
		catch(ArithmeticException ex)
		{
			//ex.printStackTrace();
			MyOwnException myExObj = new MyOwnException("WITH CUSTOM EXCEPTION MESSAGE");			
			throw myExObj;
		}
		catch(Exception exception)
		{
			System.out.println("THIS IS A GENERIC EXPCETION");
		}


		int additionResult = firstVar+ secondVar;
		
		System.out.println("ADDITION RESULT: "+additionResult);
		
		//System.out.println("DIVIDE BY ZERO: "+ (new ExceptionClass()).divide(10.0, 0.0));
		

	}

}
