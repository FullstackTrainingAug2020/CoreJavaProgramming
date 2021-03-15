package com.collections.examples;

import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(1);
		vector.add(2);
		vector.add(3);
		vector.add(4);
		vector.add(5);

		for(int index = 0; index < vector.size(); index++) {
			System.out.println("VECTOR ELEMENT : "+vector.get(index));
		}
	}

}
