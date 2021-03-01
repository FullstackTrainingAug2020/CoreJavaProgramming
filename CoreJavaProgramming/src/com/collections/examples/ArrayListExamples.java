package com.collections.examples;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExamples {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		ArrayList<Integer> listTwo = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(6);
		
//		arrayList.add("Snehith");
//		
//		arrayList.add(3, "Sujash");
		
		listTwo.add(11);
		listTwo.add(12);
		listTwo.add(13);
		listTwo.add(14);
		listTwo.add(15);
		
		//arrayList.addAll(listTwo);
		arrayList.addAll(1, listTwo);
		
		//arrayList.removeAll(listTwo);	
		try {
		arrayList.remove(8);
		//arrayList.remove("Sujash");
		}
		catch(Exception ex) {
			System.out.println("EXCEPTION RAISED and REMOVE Operation not successful");
		}
		/*
		for(int index = 0; index < arrayList.size(); index++) {
			System.out.println("ELEMENT : "+arrayList.get(index));
		}*/
		
		Iterator<Integer> it = arrayList.iterator();
		
		while(it.hasNext())
		{
			System.out.println("ELEMENT: "+it.next());
		}
	}

}
