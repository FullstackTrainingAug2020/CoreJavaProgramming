package com.oops.examples;

public class InterfaceTestClass {

	public static void main(String[] args) {
		
		/*
		InterfaceExample intObjOne = new InterfaceExample();  // INSTANTIATION
		InterfaceExampleTwo intObjTwo = new InterfaceExampleTwo();*/
		
		InterfaceA intObjOne = new MyAbstractImplementation();
		InterfaceA intObjTwo = new InterfaceExampleTwo();
		
		intObjOne.display();
		intObjTwo.display();
		
		System.out.println("CONSTANT VALUE: "+InterfaceA.name);

	}

}
