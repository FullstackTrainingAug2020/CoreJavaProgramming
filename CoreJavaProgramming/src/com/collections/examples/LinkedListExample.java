package com.collections.examples;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		ll.add(1);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		
		ll.remove(); 		
		for(int index = 0; index < ll.size(); index++) {
			System.out.println("ELEMENT : "+ll.get(index));
		}

	}

}
