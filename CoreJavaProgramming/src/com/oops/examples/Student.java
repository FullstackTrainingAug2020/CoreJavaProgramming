package com.oops.examples;

public class Student {

		// CLASS Variables or INSTANCE Variables
		int rollNumber;
		String name;
		int standard;
		
		static String str = "NAME";
		
		Student(int rNo, String name, int std){			
			rollNumber = rNo;
			this.name = name;
			standard = std;
		}
		
		Student()
		{
			rollNumber = 1;
			name = "VAMSHI";
			standard = 7;
		}
		
		void display()
		{
			String localName = "HI "+ name;  // LOCAL Variables
			System.out.println("SUTDENT NAME"+name);
			System.out.println("LOCAL VARIABLE NAME: "+localName);
		}
}
