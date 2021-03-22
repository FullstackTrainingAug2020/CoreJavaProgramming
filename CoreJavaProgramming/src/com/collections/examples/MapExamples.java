package com.collections.examples;

import java.util.HashMap;

public class MapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Snehith");
		map.put(2, "Vamshi");
		map.put(3, "Sujash");
		
		map.put(2, "Kiran");
		
		System.out.println("VALUE AT 2: "+map.get(2));

	}

}
