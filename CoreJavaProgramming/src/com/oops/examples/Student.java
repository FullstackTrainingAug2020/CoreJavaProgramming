package com.oops.examples;

public class Student {

		int rollNumber;
		String name;
		int standard;
		
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
}
