package com.oops.examples;

public class TESTFinalAndStaticVariables {

	public static void main(String[] args) {

		FinalAndStaticVariables obj = new FinalAndStaticVariables();
		
		System.out.println("CONSTANT: "+obj.topic);
		System.out.println("VARIABLE VARONE: "+obj.varOne);
		
		//System.out.println("COLLEGE NAME:"+obj.collegeName);
		
		System.out.println("COLLEGE NAME:"+FinalAndStaticVariables.collegeName);
	}

}
