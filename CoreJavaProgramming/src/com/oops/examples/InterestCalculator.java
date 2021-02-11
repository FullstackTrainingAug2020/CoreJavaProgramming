package com.oops.examples;

public class InterestCalculator {
	
	boolean isSimpleInterest;
	String interestType;
	
	public InterestCalculator() {
		System.out.println("CONSTRUCTOR CALLED");
		isSimpleInterest = true;
	}
	
	public InterestCalculator(boolean flag) {
		isSimpleInterest = flag;
	}
	
	public InterestCalculator(String interestType) {
		this.interestType = interestType;
	}
	
	public double calculateSimpleInterest(double principal, double rateOfInterest, int timePeriod) {
		return (principal*rateOfInterest*timePeriod)/100;
	}
	
	public double calculateCompoundInterest(double principal, double rateOfInterest, int timePeriod, int numberOfEMIs) {
		return (principal * Math.pow(1+ (rateOfInterest/numberOfEMIs), numberOfEMIs*timePeriod)) - principal;
	}
	
	public double principalOutstanding(double principal, double interestAmount) {
		return principal+interestAmount;
	}
	
	public void calculateInterestAndPrintOutstandingValue(double principal, double rate, int time, int numberOfMEIs) {
		
		if(isSimpleInterest == true)
			System.out.println("Total Outstanding (SIMPLE): "+ (principal + calculateSimpleInterest(principal, rate, time)) );
		else
			System.out.println("Total OutStanding (COMPOUND): " +(principal + calculateCompoundInterest(principal, rate, time, numberOfMEIs)) );
	}
	
	public void calculateInterestAndPrintOutstandingValueForInterestType(double principal, double rate, int time, int numberOfMEIs) {
		
		if(interestType.equals("SIMPLE"))
			System.out.println("Total Outstanding (SIMPLE): "+ (principal + calculateSimpleInterest(principal, rate, time)) );
		if(interestType.equals("COMPOUND"))
			System.out.println("Total OutStanding (COMPOUND): " +(principal + calculateCompoundInterest(principal, rate, time, numberOfMEIs)) );
	}
}
