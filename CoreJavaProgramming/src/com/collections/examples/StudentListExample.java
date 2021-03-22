package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentListExample {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.setRollNo(1);
		st1.setStudentName("Snehith");
		st1.setMathsMarks(90);
		st1.setScienceMarks(84);
		st1.setSocialMarks(78);
		
		Student st2 = new Student();
		st2.setRollNo(2);
		st2.setStudentName("Sujash");
		
		Student st3 = new Student();
		st3.setRollNo(3);
		st3.setStudentName("Vamshi");
		
		ArrayList<Student> tenthClassStudents = new ArrayList<Student>();
		
		tenthClassStudents.add(st1);
		tenthClassStudents.add(st2);
		tenthClassStudents.add(st3);
		
		System.out.println("USING FOR LOOP - TRAVERSING THE LIST");
		for(int i=0; i < tenthClassStudents.size(); i++)
		{
			Student stu = tenthClassStudents.get(i);
			System.out.println("RollNo: "+ stu.getRollNo()+" and Name: "+stu.getStudentName());
		}
		
		System.out.println("USING ITERATOR - TRAVERSING THE LIST");
		
		Iterator<Student> itr = tenthClassStudents.iterator();
		
		while(itr.hasNext()) {
			Student stud = itr.next();
			System.out.println("RollNo: "+ stud.getRollNo()+" and Name: "+stud.getStudentName());
		}

	}

}
