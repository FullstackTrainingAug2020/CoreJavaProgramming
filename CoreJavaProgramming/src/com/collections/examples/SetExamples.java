package com.collections.examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		set.add(10);
		
		set.remove(4);
		Iterator<Integer> it = set.iterator();

		while(it.hasNext())
		{
			System.out.println("ELEMENT: "+ it.next());
		}
		
	}

}
