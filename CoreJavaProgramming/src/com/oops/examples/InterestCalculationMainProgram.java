package com.oops.examples;

public class InterestCalculationMainProgram {

	public static void main(String[] args) {
		
		InterestCalculator icObj = new InterestCalculator("SIMPLE");
		InterestCalculator compoundICObj = new InterestCalculator("COMPOUND");
		InterestCalculator obj = new InterestCalculator("");
	
		/*
		InterestCalculator icObj = new InterestCalculator(true);
		InterestCalculator compoundICObj = new InterestCalculator(false);
		
		
		double simpleInterestAmount = icObj.calculateSimpleInterest(10000, 12, 1);
		double compundInterestAmount = icObj.calculateCompoundInterest(10000, 2, 1, 6);
		
		System.out.println("Simple INTEREST: "+simpleInterestAmount);
		System.out.println("Compound INTEREST: "+ compundInterestAmount);
		System.out.println("Principal Outstanding (Simple Interest):"+icObj.principalOutstanding(10000, simpleInterestAmount));
		System.out.println("Principal Outstanding (Compound Interest):"+icObj.principalOutstanding(10000, compundInterestAmount));*/
		System.out.println("BOOLEAN - SIMPLE: "+icObj.isSimpleInterest);
		System.out.println("BOOLEAN - COMPOUND: "+compoundICObj.isSimpleInterest);
		icObj.calculateInterestAndPrintOutstandingValueForInterestType(10000, 12, 1, 1);
		compoundICObj.calculateInterestAndPrintOutstandingValueForInterestType(10000, 10, 1, 1);
		obj.calculateInterestAndPrintOutstandingValueForInterestType(10000, 10, 1, 1);

	}

}
